package com.server.TicketingSystem.servlet.client;

import com.server.TicketingSystem.domain.User;
import com.server.TicketingSystem.exception.LoginException;
import com.server.TicketingSystem.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author qxq
 */

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //2.调用service来判断用户名和密码是否正确。
        UserService service = new UserService();
        try {
            User user = service.login(username, password);
            //3.说明用户名和密码正确
            if (user.getUser_state() == 1) {//如果用户的状态为激活,才允许登录
                request.getSession().setAttribute("user",user);
                //3.1 用户为超级管理员,跳转到后台的页面
                String role = user.getUser_role();
                if (role.equals("超级用户")){
                    response.sendRedirect(request.getContextPath()+"/admin/login/home.jsp");
                }else {
                    response.sendRedirect(request.getContextPath()+"/admin/myAccount.jsp");
                }

            }
        } catch (LoginException e) {
            e.printStackTrace();
            request.setAttribute("register_message", e.getMessage());
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }


    }
}
