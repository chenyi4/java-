package com.javaweb.demo.servlet;

import com.javaweb.demo.dao.UserDao;
import com.javaweb.demo.dao.impl.UserDaoImpl;
import com.javaweb.demo.entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FindUserListServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserDao ud = new UserDaoImpl();
        List<User> userAll = ud.getUserAll();
        request.setAttribute("userAll", userAll);
        request.getRequestDispatcher("/userlist.jsp").forward(request, response);
    }

}