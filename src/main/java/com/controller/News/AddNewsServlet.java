package com.controller.News;

import com.entity.New;
import com.service.NewService;
import com.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/addnews")
public class AddNewsServlet extends HttpServlet {
    private NewService newService = ServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/jsp/addnew.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        String title= req.getParameter("title");
        String content = req.getParameter("content");
        New n=new New(title,content);
        newService.addNews(n);
        resp.sendRedirect(req.getContextPath() +"/listnews");
    }
}
