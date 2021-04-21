package com.server.TicketingSystem.domain;

import java.sql.Time;

public class Tickets {
    private int ticket_id;
    private String air_company;
    private int ticket_price;
    private Time ticket_startTime;
    private Time ticket_arrivalTime;
    private boolean air_isTransit;
    private String air_transitField;

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
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

    public boolean isAir_isTransit() {
        return air_isTransit;
    }

    public void setAir_isTransit(boolean air_isTransit) {
        this.air_isTransit = air_isTransit;
    }

    public String getAir_transitField() {
        return air_transitField;
    }

    public void setAir_transitField(String air_transitField) {
        this.air_transitField = air_transitField;
    }
}
