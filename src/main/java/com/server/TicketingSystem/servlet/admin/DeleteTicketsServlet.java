package com.server.TicketingSystem.servlet.admin;

import com.server.TicketingSystem.service.TicketsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author qxq
 */

@WebServlet(name = "DeleteTicketsServlet", value = "/DeleteTicketsServlet")
public class DeleteTicketsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("ticket_id");
        TicketsService service = new TicketsService();
        try {
            service.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write(e.getMessage());
        }
        response.sendRedirect(request.getContextPath()+"/admin/index.jsp");
    }
}
