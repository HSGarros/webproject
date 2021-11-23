package com.controller;

import com.service.ServiceFactory;
import com.service.NewService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    private NewService newService = ServiceFactory.getUserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("news", newService.listFiveNews());
        req.getRequestDispatcher("/WEB-INF/jsp/index.jsp")
                .forward(req, resp);
    }
}
