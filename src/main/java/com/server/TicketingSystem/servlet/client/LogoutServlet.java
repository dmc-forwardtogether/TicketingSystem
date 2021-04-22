package com.server.TicketingSystem.servlet.client;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author qxq
 */

@WebServlet(name = "LogoutServlet", value = "/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取session对象.
        HttpSession session = request.getSession();
        // 销毁session
        session.invalidate();
        // flag标识
        String flag = request.getParameter("flag");
        if (flag == null || flag.trim().isEmpty()) {
            // 重定向到首页
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    }
}
