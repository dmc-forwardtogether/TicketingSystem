package com.server.TicketingSystem.servlet.admin;

import com.server.TicketingSystem.domain.Tickets;
import com.server.TicketingSystem.service.TicketsService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.sql.Time;

/**
 * @author qxq
 */

@WebServlet(name = "UpdateTicketsServlet", value = "/UpdateTicketsServlet")
public class UpdateTicketsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Tickets tickets = new Tickets();

        String id = request.getParameter("ticket_id");
        String company = request.getParameter("air_company");
        int price = Integer.parseInt(request.getParameter("ticket_id"));
        Date date = Date.valueOf(request.getParameter("ticket_date"));
        Time startTime = Time.valueOf(request.getParameter("ticket_startTime"));
        Time arrivalTime = Time.valueOf(request.getParameter("ticket_arrivalTime"));
        String departure = request.getParameter("departure");
        String destination = request.getParameter("destination");

        tickets.setTicket_id(id);
        tickets.setAir_company(company);
        tickets.setTicket_price(price);
        tickets.setTicket_date(date);
        tickets.setTicket_startTime(startTime);
        tickets.setTicket_arrivalTime(arrivalTime);
        tickets.setDeparture(departure);
        tickets.setDestination(destination);

        try {
            BeanUtils.populate(tickets,request.getParameterMap());
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        TicketsService service = new TicketsService();
        try {
            service.update(tickets);
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write(e.getMessage());
        }
        response.sendRedirect(request.getContextPath()+"/admin/index.jsp");
    }
}
