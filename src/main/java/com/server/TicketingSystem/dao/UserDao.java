package com.server.TicketingSystem.dao;

import com.server.TicketingSystem.domain.User;
import com.server.TicketingSystem.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDao {

    //添加用户
    public void addUser(User user) throws SQLException {
        String sql = "insert into qxq_ticket.user(user_username, user_PASSWORD, " +
                "user_birthday,user_introduce, user_gender, user_telephone)" +
                " values(?,?,?,?,?,?)";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        int row = runner.update(sql,user.getUser_username(),user.getUser_password(),
                user.getUser_birthday(),user.getUser_introduce(),user.getUser_gender(),
                user.getUser_telephone());
        if (row == 0){
            throw new RuntimeException();
        }
    }

    //更新用户
    public void updateUser(User user) throws SQLException {
        String sql = "UPDATE qxq_ticket.user SET user_username=?, user_PASSWORD=?, " +
                "user_birthday=?,user_introduce=?, user_gender=?, user_telephone=?" +
                "WHERE user_id=?";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        int row = runner.update(sql,user.getUser_username(),user.getUser_password(),
                user.getUser_birthday(),user.getUser_introduce(),user.getUser_gender(),
                user.getUser_telephone(),user.getUser_id());
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
