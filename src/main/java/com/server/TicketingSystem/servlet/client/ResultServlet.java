package com.server.TicketingSystem.servlet.client;

import com.server.TicketingSystem.domain.Tickets;
import com.server.TicketingSystem.service.TicketsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

/**
 * @author qxq
 */

@WebServlet(name = "ResultServlet", value = "/ResultServlet")
public class ResultServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ticket_id = request.getParameter("ticket_id");
        Date ticket_date = Date.valueOf(request.getParameter("ticket_date"));
        TicketsService ticketsService = new TicketsService();
        try {
            Tickets tickets = ticketsService.result(ticket_id, ticket_date);
            request.getSession().setAttribute("ticket_result", tickets);
            if (tickets != null) {
                request.getRequestDispatcher("/add_passenger.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
