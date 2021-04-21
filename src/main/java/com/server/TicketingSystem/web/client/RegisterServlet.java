package com.server.TicketingSystem.web.client;

import com.server.TicketingSystem.domain.User;
import com.server.TicketingSystem.utils.ActiveCodeUtils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @author qxq
 */

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //JavaBean
        User user = new User();
        try {
            BeanUtils.populate(user,request.getParameterMap());
            //激活码
            user.setUser_activeCode(ActiveCodeUtils.createActiveCode());
        }catch (IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }

        //调用Service

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
