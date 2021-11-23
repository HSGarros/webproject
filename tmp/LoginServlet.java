/*package com.controller;

import com.entity.Accounter;
//import com.service.AccounterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String password = req.getParameter("pwd");
        String url;
        if ("admin".equals(account) && "admin".equals(password)) {
            Accounter accounter = new Accounter("admin",7);
            req.getSession().setAttribute("accounter", accounter);
            url = "/admin";
//        }else if ("123".equals(account) && "123".equals(password)) {
//            url = "/welcome";
//        } else if (AccounterServiceImpl.comparePassward(account,password)) {
//            url = "/welcome";
        } else {
            url = "/login";
        }
        resp.sendRedirect(req.getContextPath() + url);
    }
}*/
