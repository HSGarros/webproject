package com.controller.News;

import com.entity.New;
import com.service.NewService;
import com.service.ServiceFactory;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/dropnew")
public class DropNewsServlet extends HttpServlet {
    private NewService newService = ServiceFactory.getUserService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id= Integer.parseInt(req.getParameter("nid"));
        newService.dropNew(id);
        resp.sendRedirect(req.getContextPath() +"/listnews");
    }
}
