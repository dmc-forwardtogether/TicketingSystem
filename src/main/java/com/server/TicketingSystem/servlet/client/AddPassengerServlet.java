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
import java.sql.Date;

/**
 * @author qxq
 */

@WebServlet(name = "AddPassengerServlet", value = "/AddPassengerServlet")
public class AddPassengerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String id_card = request.getParameter("id_card");
        String gender = request.getParameter("gender");
        String air_id = request.getParameter("air_id");
        String departure =request.getParameter("departure");
        String destination =request.getParameter("destination");
        Date ticket_date = Date.valueOf(request.getParameter("ticket_date"));

        Tickets tickets =(Tickets) request.getSession().getAttribute("ticket_result");
        String ticket_id = tickets.getTicket_id();

        Passenger passenger = new Passenger();
        passenger.setPassenger_name(name);
        passenger.setPassenger_idCard(id_card);
        passenger.setPassenger_gender(gender);
        passenger.setAir_id(air_id);
        passenger.setDeparture(departure);
        passenger.setDestination(destination);
        passenger.setTicket_date(ticket_date);
        passenger.setTickets_id(ticket_id);
        PassengerService service = new PassengerService();
        try {
            service.addPassenger(passenger);
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write(e.getMessage());
        }
        //添加乘客信息成功,跳转到订单页面
        response.sendRedirect(request.getContextPath()+"/QueryOrderServlet");
    }
}
