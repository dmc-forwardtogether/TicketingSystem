package com.server.TicketingSystem.domain;

import java.sql.Date;

public class Passenger {
    private int passenger_id;
    private String passenger_name;
    private String passenger_gender;
    private String passenger_idCard;
    private String air_id;
    private String departure;
    private String destination;
    private Date ticket_date;
    private String tickets_id;

    public String getTickets_id() {
        return tickets_id;
    }

    public void setTickets_id(String tickets_id) {
        this.tickets_id = tickets_id;
    }

    public int getPassenger_id() {
        return passenger_id;
    }

    public void setPassenger_id(int passenger_id) {
        this.passenger_id = passenger_id;
    }

    public String getPassenger_name() {
        return passenger_name;
    }

    public void setPassenger_name(String passenger_name) {
        this.passenger_name = passenger_name;
    }

    public String getPassenger_gender() {
        return passenger_gender;
    }

    public void setPassenger_gender(String passenger_gender) {
        this.passenger_gender = passenger_gender;
    }

    public String getPassenger_idCard() {
        return passenger_idCard;
    }

    public void setPassenger_idCard(String passenger_idCard) {
        this.passenger_idCard = passenger_idCard;
    }

    public String getAir_id() {
        return air_id;
    }

    public void setAir_id(String air_id) {
        this.air_id = air_id;
    }

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

    public Date getTicket_date() {
        return ticket_date;
    }

    public void setTicket_date(Date ticket_date) {
        this.ticket_date = ticket_date;
    }
}
