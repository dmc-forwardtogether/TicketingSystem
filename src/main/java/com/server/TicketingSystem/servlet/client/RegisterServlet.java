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
        try {
            BeanUtils.populate(user,request.getParameterMap());
        }catch (IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }

        //调用Service
        UserService service = new UserService();
        try {
            service.register(user);
        } catch (RegisterException e) {
            e.printStackTrace();
            response.getWriter().write(e.getMessage());
        }
        //注册成功,跳转到主页
        response.sendRedirect(request.getContextPath()+"/index.jsp");
    }
}
