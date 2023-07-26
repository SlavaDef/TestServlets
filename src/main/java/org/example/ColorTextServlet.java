package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


// сервелет по запросу виводить текст і задається колір
//http://localhost:8080/ServeletsJaaR/?text=Hell&color=red - запрос

//@WebServlet(value = "/*")
public class ColorTextServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // Получаем параметр “text” и “color” из запроса
        String text = request.getParameter("text"); // що буде писатися в запросі
        String color = request.getParameter("color"); // що буде писатися в запросі


        // Печатаем HTML в качестве ответа для браузера
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out =  response.getWriter();
        try {
            out.println("<html>");
            out.println("<head> <title> ColorTextServlet </title> </head>");
            out.println("<body>");
            out.println("<h1 style=color:"+color+">"+ text +"</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
