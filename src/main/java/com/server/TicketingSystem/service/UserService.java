package com.server.TicketingSystem.service;

import com.server.TicketingSystem.dao.UserDao;
import com.server.TicketingSystem.domain.User;
import com.server.TicketingSystem.exception.RegisterException;

public class UserService {
    private UserDao userDao = new UserDao();

    //注册操作
    public void register(User user) throws RegisterException{
        try{
            userDao.addUser(user);
        }catch(Exception e){
            e.printStackTrace();
            throw new RegisterException("注册失败");
        }
    }
}
