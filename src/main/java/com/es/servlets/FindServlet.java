package com.es.servlets;

import com.es.dao.CustomerDao;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/find")
public class FindServlet extends HttpServlet {
    @EJB
    protected CustomerDao customerDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.valueOf(req.getParameter("id"));
        req.setAttribute("res", customerDao.findById(id));

        req.getRequestDispatcher("/WEB-INF/pages/find.jsp").forward(req, resp);
    }
}
