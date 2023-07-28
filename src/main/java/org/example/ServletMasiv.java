package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

@WebServlet(value = "/friends")
public class ServletMasiv extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> users = new ArrayList<>();
        Collections.addAll(users, "Tom", "Bob", "Sam","Jon", "Kate","Helen");
        request.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/forMasiv.jsp").forward(request, response);
    }
}
