package com.server.TicketingSystem.domain;

import java.sql.Date;

public class Passenger {
    private int passenger_id;
    private String passenger_name;
    private String passenger_gender;
    private String passenger_destination;
    private String passenger_idCard;
    private String passenger_organization;
    private Date passenger_time;
    private String air_id;

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

    public String getPassenger_destination() {
        return passenger_destination;
    }

    public void setPassenger_destination(String passenger_destination) {
        this.passenger_destination = passenger_destination;
    }

    public String getPassenger_idCard() {
        return passenger_idCard;
    }

    public void setPassenger_idCard(String passenger_idCard) {
        this.passenger_idCard = passenger_idCard;
    }

    public String getPassenger_organization() {
        return passenger_organization;
    }

    public void setPassenger_organization(String passenger_organization) {
        this.passenger_organization = passenger_organization;
    }

    public Date getPassenger_time() {
        return passenger_time;
    }

    public void setPassenger_time(Date passenger_time) {
        this.passenger_time = passenger_time;
    }

    public String getAir_id() {
        return air_id;
    }

    public void setAir_id(String air_id) {
        this.air_id = air_id;
    }
}
