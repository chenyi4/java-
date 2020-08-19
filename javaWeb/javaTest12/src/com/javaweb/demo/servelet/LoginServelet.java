package com.javaweb.demo.servelet;

import com.javaweb.demo.allmethods.AllConnect;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("登陆初始化");
        resp.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String name = request.getParameter("name"); //得到jsp页面传过来的参数
        String pwd = request.getParameter("pwd");

        AllConnect ud = new AllConnect();
        System.out.println(ud.login(name, pwd));
        if (ud.login(name, pwd)) {
            System.out.println("登陆成功");
            request.setAttribute("xiaoxi", "欢迎用户" + name);
            request.getRequestDispatcher("/success.jsp").forward(request, resp);
        } else {
            request.setAttribute("xiaoxi", "账号密码错误,请重新登陆");
            request.getRequestDispatcher("/login.jsp").forward(request, resp);
//                    sendRedirect("login.jsp");
        }
    }
}
