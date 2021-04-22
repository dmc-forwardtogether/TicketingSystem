package com.server.TicketingSystem.dao;

import com.server.TicketingSystem.domain.Tickets;
import com.server.TicketingSystem.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class TicketsDao {

    //根据激活码查找用户
    public List<Tickets> findTicketsByDepartureAndDestinationAndTime(String departure, String destination, Date date)
            throws SQLException {
        String sql = "select * from qxq_ticket.tickets where departure=? and destination=? and ticket_date=?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        return runner.query(sql, new BeanListHandler<Tickets>(Tickets.class), departure, destination, date);
    }
}
