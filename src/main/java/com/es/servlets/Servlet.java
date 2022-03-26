package com.es.servlets;

import com.es.dao.CustomerDao;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/myServlet")
public class Servlet extends HttpServlet {
    @EJB
    protected CustomerDao customerDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("lines", customerDao.findAll());

        req.getRequestDispatcher("/WEB-INF/pages/result.jsp").forward(req, resp);
    }
}
