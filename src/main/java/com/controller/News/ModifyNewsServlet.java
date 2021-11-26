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

@WebServlet("/modifynews")
public class ModifyNewsServlet extends HttpServlet {
    private NewService newService = ServiceFactory.getUserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("nid"));
        req.setAttribute("get_new", newService.getNew(id));
        req.getRequestDispatcher("/WEB-INF/jsp/modifynew.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int nid= Integer.parseInt(req.getParameter("nid"));
        String title= req.getParameter("title");
        String content = req.getParameter("content");
        New n=new New(title,content);
        newService.modifyNew(nid,n);
        resp.sendRedirect(req.getContextPath() +"/listnews");
    }
}
