package com.server.TicketingSystem.dao;

import com.server.TicketingSystem.domain.User;
import com.server.TicketingSystem.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao {

    //添加用户
    public void addUser(User user) throws SQLException {
        String sql = "insert into qxq_ticket.user(user_username,user_PASSWORD,user_birthday," +
                "user_activeCode,user_gender,user_introduce,user_registerTime," +
                "user_role,user_state,user_telephone) values(?,?,?,?,?,?,?,?,?,?)";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        int row = runner.update(sql,user.getUser_username(),user.getUser_password(),
                user.getUser_birthday(),user.getUser_activeCode());
        if (row == 0){
            throw new RuntimeException();
        }
    }

    //根据激活码查找用户
    public User findUserByActiveCode(String activeCode)
            throws SQLException{
        String sql = "select * from qxq_ticket.user where user_activeCode=?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        return runner.query(sql, new BeanHandler<>(User.class),activeCode);
    }

    //激活用户
    public void activeUser(String activeCode) throws SQLException{
        //1.准备sql
        String sql = "update qxq_ticket.user set user_state=? where user_activeCode=?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        //2.把用户的状态设置为激活:1
        int row = runner.update(sql,1,activeCode);
        if (row == 0){
            throw new RuntimeException();
        }
    }

    //根据用户名与密码查找用户
    public User findUserByUsernameAndPassword(String username, String password) throws SQLException{
        //1.准备sql
        String sql = "select * from qxq_ticket.user where user_username=? and user_PASSWORD=?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        return runner.query(sql, new BeanHandler<>(User.class),username,password);
    }
}
