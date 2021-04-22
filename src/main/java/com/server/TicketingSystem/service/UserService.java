package com.server.TicketingSystem.service;

import com.server.TicketingSystem.dao.UserDao;
import com.server.TicketingSystem.domain.User;
import com.server.TicketingSystem.exception.LoginException;
import com.server.TicketingSystem.exception.RegisterException;

import java.sql.SQLException;

public class UserService {
    private final UserDao userDao = new UserDao();

    //注册操作
    public void register(User user) throws RegisterException{
        try{
            userDao.addUser(user);
        }catch(Exception e){
            e.printStackTrace();
            throw new RegisterException("注册失败");
        }
    }

    /**
     * @author qxq
     * 登录操作
     */
    public User login(String username, String password) throws LoginException {
        //1.调用dao
        UserDao dao = new UserDao();
        try {
            return dao.findUserByUsernameAndPassword(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new LoginException("用户名或者密码错误");
        }
    }

}
