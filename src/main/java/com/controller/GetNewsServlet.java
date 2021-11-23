package com.controller;

import com.service.ServiceFactory;
import com.service.NewService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getnew")
public class GetNewsServlet extends HttpServlet {
    // 基于ServiceFactory工厂，获取单例的NewsService组件
    private NewService newService = ServiceFactory.getUserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取指定ID新闻的详细信息
        int id = Integer.parseInt(req.getParameter("nid"));
        req.setAttribute("get_new", newService.getNew(id));
        req.setAttribute("test", "newService.getNew(id)");
        req.getRequestDispatcher("/WEB-INF/jsp/query.jsp")
                .forward(req, resp);

    }
}
