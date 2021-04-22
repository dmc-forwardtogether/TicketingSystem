package com.server.TicketingSystem.domain;

import java.sql.Date;
import java.sql.Time;

public class Tickets {
    private String ticket_id;
    private String air_company;
    private String departure;
    private String destination;
    private Date ticket_date;
    private int ticket_price;
    private Time ticket_startTime;
    private Time ticket_arrivalTime;

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(String ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getAir_company() {
        return air_company;
    }

    public void setAir_company(String air_company) {
        this.air_company = air_company;
    }

    public int getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(int ticket_price) {
        this.ticket_price = ticket_price;
    }

    public Time getTicket_startTime() {
        return ticket_startTime;
    }

    public void setTicket_startTime(Time ticket_startTime) {
        this.ticket_startTime = ticket_startTime;
    }

    public Time getTicket_arrivalTime() {
        return ticket_arrivalTime;
    }

    public void setTicket_arrivalTime(Time ticket_arrivalTime) {
        this.ticket_arrivalTime = ticket_arrivalTime;
    }

    public Date getTicket_date() {
        return ticket_date;
    }

    public void setTicket_date(Date ticket_date) {
        this.ticket_date = ticket_date;
    }
}
