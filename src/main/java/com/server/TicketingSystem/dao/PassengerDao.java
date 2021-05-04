package com.server.TicketingSystem.dao;

import com.server.TicketingSystem.domain.Passenger;
import com.server.TicketingSystem.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class PassengerDao {
    public void addPassenger(Passenger passenger) throws SQLException {
        String sql = "insert ignore qxq_ticket.passenger(passenger_name, passenger_gender," +
                " passenger_idCard, air_id, departure,destination,ticket_date,tickets_id) values(?,?,?,?,?,?,?,?)";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        int row = runner.update(sql,passenger.getPassenger_name(),passenger.getPassenger_gender(),
                passenger.getPassenger_idCard(),passenger.getAir_id(),passenger.getDeparture(),
                passenger.getDestination(),passenger.getTicket_date(),passenger.getTickets_id());
        if (row == 0){
            throw new RuntimeException();
        }
    }

    public List<Passenger> query(String ticket_id) throws SQLException {
        String sql = "select a.*,b.* from qxq_ticket.passenger a, qxq_ticket.tickets b " +
                "where a.tickets_id=b.ticket_id=?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        return runner.query(sql, new BeanListHandler<>(Passenger.class), ticket_id);
    }
}
