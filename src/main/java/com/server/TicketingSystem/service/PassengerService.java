package com.server.TicketingSystem.service;

import com.server.TicketingSystem.dao.PassengerDao;
import com.server.TicketingSystem.domain.Passenger;

import java.util.List;

public class PassengerService {
    private final PassengerDao passengerDao = new PassengerDao();

    public void addPassenger(Passenger passenger) throws Exception {
        try{
            passengerDao.addPassenger(passenger);
        }catch(Exception e){
            e.printStackTrace();
            throw new Exception("添加乘客失败");
        }
    }

    public List<Passenger> query(String ticket_id) throws Exception {
        return  passengerDao.query(ticket_id);
    }
}
