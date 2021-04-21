package com.server.TicketingSystem.dao;

import com.server.TicketingSystem.domain.User;
import com.server.TicketingSystem.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class UserDao {

    //添加用户
    public void addUser(User user) throws SQLException {
        String sql = "insert into qxq_ticket.user(user_username,user_PASSWORD,user_birthday," +
                "user_activeCode) values(?,?,?,?)";
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        int row = runner.update(sql,user.getUser_username(),user.getUser_password(),
                user.getUser_birthday(),user.getUser_activeCode());
        if (row == 0){
            throw new RuntimeException();
        }
    }
}
