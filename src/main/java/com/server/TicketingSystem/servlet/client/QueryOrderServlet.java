package com.server.TicketingSystem.servlet.client;

import com.server.TicketingSystem.domain.Passenger;
import com.server.TicketingSystem.domain.Tickets;
import com.server.TicketingSystem.service.PassengerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author qxq
 */

@WebServlet(name = "QueryOrderServlet", value = "/QueryOrderServlet")
public class QueryOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Tickets tickets = (Tickets) request.getSession().getAttribute("ticket_result");

            String ticket_id = tickets.getTicket_id();
            PassengerService passengerService = new PassengerService();
            List<Passenger> orders;
            try {
                orders = passengerService.query(ticket_id);
                if (orders != null) {
                    request.getSession().setAttribute("orders", orders);
                    request.getRequestDispatcher("/order.jsp").forward(request, response);
                }
            } catch (Exception e) {
                e.printStackTrace();
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
        }
}