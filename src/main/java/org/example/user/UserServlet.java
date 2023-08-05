package org.example.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


//@WebServlet("/user")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User tom = new User("Tom", 25);
       // User jerri = new User("Jerri", 15);
        request.setAttribute("user", tom);
       // request.setAttribute("user", jerri);
        getServletContext()
                .getRequestDispatcher("/user.jsp")
                .forward(request, response);
    }


}
