package com.server.TicketingSystem.dao;

import com.server.TicketingSystem.domain.Tickets;
import com.server.TicketingSystem.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class TicketsDao {

    public List<Tickets> findTicketsByDepartureAndDestinationAndTime(String departure, String destination, Date date)
            throws SQLException {
        String sql = "select * from qxq_ticket.tickets where departure=? and destination=? and ticket_date=?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        return runner.query(sql, new BeanListHandler<>(Tickets.class), departure, destination, date);
    }

    public Tickets findTicketsByTicket_idAndTicket_date(String ticket_id,Date ticket_date)
            throws SQLException {
        String sql = "select * from qxq_ticket.tickets where ticket_id=? and ticket_date=?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        return runner.query(sql, new BeanHandler<>(Tickets.class), ticket_id, ticket_date);
    }

    public void addTickets(Tickets tickets) throws SQLException{
        String sql = "insert into qxq_ticket.tickets(ticket_id, air_company, ticket_price, ticket_date, " +
                "ticket_startTime, ticket_arrivalTime, departure, destination) values (?,?,?,?,?,?,?,?)";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        int row = runner.update(sql,tickets.getTicket_id(),tickets.getAir_company(),tickets.getTicket_price(),
                tickets.getTicket_date(), tickets.getTicket_startTime(), tickets.getTicket_arrivalTime(),
                tickets.getDeparture(),tickets.getDestination());
        if (row == 0) {
            throw new RuntimeException();
        }
    }

    public void delete(String id) throws SQLException {
        String sql = "delete from qxq_ticket.tickets where ticket_id = ?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        runner.update(sql,id);
    }

    public void update(Tickets tickets) throws SQLException{
        String sql = "update qxq_ticket.tickets set air_company=?, ticket_price=?, ticket_date=?, " +
                "ticket_startTime=?, ticket_arrivalTime=?, departure=?, destination=? where ticket_id=?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        runner.update(sql,tickets.getAir_company(),tickets.getTicket_price(),
                tickets.getTicket_date(), tickets.getTicket_startTime(), tickets.getTicket_arrivalTime(),
                tickets.getDeparture(),tickets.getDestination(),tickets.getTicket_id());
    }
}
