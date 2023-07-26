package org.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// запрос http://localhost:8080/ServeletsJaaR/?a=5&b=3 - відповідь 8 буде якщо value = "/*
// http://localhost:8080/ServeletsJaaR/calc?a=12&b=8 якщо value = "/calc
// http://localhost:8080/ServeletsJaaR/calc?a=12&b=8&color=green

//@WebServlet(value = "/calc")
public class Calc extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // Получаем параметр “a” и “b” из запроса
        String a = request.getParameter("a"); // що буде писатися в запросі
        String b = request.getParameter("b"); // що буде писатися в запросі
        String color = request.getParameter("color");
        String text = "You resalt is ";


            // Преобразовываем строки в числа и считаем сумму
            int sum = Integer.parseInt(a) + Integer.parseInt(b);

            // Печатаем HTML в качестве ответа для браузера
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter(); // визиваємо врайтер
        try {
            out.println("<html>");
            out.println("<head> <title> CalculatorServlet </title> </head>");
            out.println("<body>");
            out.println("<h1 >"+ text + "</h1>");
           // out.println("<h1> Sum == " + sum + "</h1>"); // просто сума
            out.println("<h1 style=color:"+color+">Sum == "+ sum +"</h1>"); // сума + колір+Sum ==
           // out.println("<h1 style=color:"+color+">"+ sum +"</h1>"); // сума + колір
            out.println("<h2 >"+ text + "</h2>"); // напише під
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
