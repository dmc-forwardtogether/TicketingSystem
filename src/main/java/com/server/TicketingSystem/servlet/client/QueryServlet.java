package com.server.TicketingSystem.servlet.client;

import com.server.TicketingSystem.domain.Tickets;
import com.server.TicketingSystem.exception.QueryException;
import com.server.TicketingSystem.service.TicketsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

/**
 * @author qxq
 */

@WebServlet(name = "QueryServlet", value = "/query")
public class QueryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取出发点目的地和时间
        String departure = request.getParameter("departure");
        String destination = request.getParameter("destination");
        Date time = Date.valueOf(request.getParameter("time"));
        //调用service返回结果集
        TicketsService ticketsService = new TicketsService();
        try {
            List<Tickets> tickets = ticketsService.query(departure,destination,time);
            request.getSession().setAttribute("tickets",tickets);
            if (tickets != null){
                request.getRequestDispatcher("/result.jsp").forward(request, response);
            }
        } catch (QueryException e) {
            e.printStackTrace();
            request.getRequestDispatcher("/query.jsp").forward(request, response);
        }
    }
}
