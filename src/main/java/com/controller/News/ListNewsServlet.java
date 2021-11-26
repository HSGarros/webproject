package com.controller.News;

import com.service.NewService;
import com.service.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/listnews")
public class ListNewsServlet extends HttpServlet {
    private NewService newService = ServiceFactory.getUserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("news", newService.listFiveNews());
        req.getRequestDispatcher("/WEB-INF/jsp/listnew.jsp").forward(req,resp);
    }
}
