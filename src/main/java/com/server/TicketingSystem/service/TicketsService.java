package com.server.TicketingSystem.service;

import com.server.TicketingSystem.dao.TicketsDao;
import com.server.TicketingSystem.domain.Tickets;
import com.server.TicketingSystem.exception.QueryException;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class TicketsService {
    public List<Tickets> query(String departure, String destination, Date date) throws QueryException {
        TicketsDao dao = new TicketsDao();
        try {
            return dao.findTicketsByDepartureAndDestinationAndTime(departure, destination, date);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new QueryException("暂无航班信息");
        }
    }

    public Tickets result(String ticket_id,Date ticket_date) throws Exception{
        TicketsDao dao = new TicketsDao();
        return dao.findTicketsByTicket_idAndTicket_date(ticket_id,ticket_date);
    }

    public void add(Tickets tickets) throws Exception{
        TicketsDao dao = new TicketsDao();
        dao.addTickets(tickets);
    }

    public void delete(String id) throws Exception{
        TicketsDao dao = new TicketsDao();
        dao.delete(id);
    }

    public void update(Tickets tickets) throws Exception{
        TicketsDao dao = new TicketsDao();
        dao.update(tickets);
    }
}
