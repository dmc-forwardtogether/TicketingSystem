package com.server.TicketingSystem.domain;

import java.sql.Date;

public class User {
    private int user_id;
    private String user_username;
    private String user_password;
    private Date user_birthday;
    private String user_activeCode;

    public String getUser_activeCode() {
        return user_activeCode;
    }

    public void setUser_activeCode(String user_activeCode) {
        this.user_activeCode = user_activeCode;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }
}
