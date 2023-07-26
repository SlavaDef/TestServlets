package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

// http://localhost:8080/ServeletsJaaR/?secret - resalt - Example Servlet

//@WebServlet(value = "/*")
public class FirstHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Получаем параметр “secret” из запроса
        String secret = request.getParameter("secret");

        // Кладем параметр “secret” в Http-сессию
        HttpSession session = request.getSession(true);
        session.setAttribute("secret", secret);

        // Печатаем HTML в качестве ответа для браузера
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>TITLE</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Example Servlet "+ secret +"</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}


