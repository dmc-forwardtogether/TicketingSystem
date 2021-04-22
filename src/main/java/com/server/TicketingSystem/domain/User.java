package com.server.TicketingSystem.domain;

import java.sql.Date;

public class User {
    private int user_id; // 用户编号
    private String user_username; // 用户姓名
    private String user_password; // 用户密码
    private Date user_birthday; // 用户生日
    private String user_gender; // 用户性别
    private String user_activeCode;// 激活码
    private String user_telephone; // 用户联系电话
    private String user_introduce; // 用户介绍
    private String user_role; // 用户角色
    private int user_state; // 用户状态
    private Date user_registerTime;// 注册时间
    
    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_telephone() {
        return user_telephone;
    }

    public void setUser_telephone(String user_telephone) {
        this.user_telephone = user_telephone;
    }

    public String getUser_introduce() {
        return user_introduce;
    }

    public void setUser_introduce(String user_introduce) {
        this.user_introduce = user_introduce;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public int getUser_state() {
        return user_state;
    }

    public void setUser_state(int user_state) {
        this.user_state = user_state;
    }

    public Date getUser_registerTime() {
        return user_registerTime;
    }

    public void setUser_registerTime(Date user_registerTime) {
        this.user_registerTime = user_registerTime;
    }

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
