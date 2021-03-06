package com.server.TicketingSystem.servlet.client;

import com.server.TicketingSystem.domain.User;
import com.server.TicketingSystem.exception.RegisterException;
import com.server.TicketingSystem.service.UserService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;

/**
 * @author qxq
 */

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //JavaBean
        User user = new User();

        String password = request.getParameter("password");
        String re_password = request.getParameter("re_password");

        user.setUser_username(request.getParameter("username"));
        user.setUser_password(password);
        user.setUser_birthday(Date.valueOf(request.getParameter("birthday")));
        user.setUser_introduce(request.getParameter("message"));
        user.setUser_gender(request.getParameter("gender"));
        user.setUser_telephone(request.getParameter("telephone"));

        String imgCode = request.getParameter("imgCode");
        String word = (String) request.getSession().getAttribute("check_session");

        try {
            BeanUtils.populate(user,request.getParameterMap());
        }catch (IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
        //调用Service
        UserService service = new UserService();
        try {
            if (imgCode.equals(word) && password.equals(re_password)) {
                service.register(user);
            } else if (!imgCode.equals(word)){
                throw new RegisterException("验证码错误");
            } else {
                throw new RegisterException("两次密码不一致");
            }
        } catch (RegisterException e) {
            e.printStackTrace();
            response.getWriter().write(e.getMessage());
        }
        //注册成功,跳转到主页
        response.sendRedirect(request.getContextPath()+"/index.jsp");
    }
}
