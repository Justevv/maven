package com.epam.webapp.webcontroller;


import com.epam.webapp.DAO.DataAccess;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FrontController extends HttpServlet {
    /**
     * @param request
     * @param response
     * @throws IOException
     * write test data
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        DataAccess dataAccess = new DataAccess();
        PrintWriter out = response.getWriter();
        out.println(dataAccess.getTestData());

    }
}
