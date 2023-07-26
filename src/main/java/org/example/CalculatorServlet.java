package org.example;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

// запит http://localhost:8080/ServeletsJaaR/?n=9&n=9 виведе Sum = 18

//@WebServlet(value = "/*") // сервлет буде рахувати суму
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Получаем атрибут “sum” из сессии
        HttpSession session = request.getSession();

        Integer sum = (Integer) session.getAttribute("sum");
        //Обрабатываем ситуацию, когда такого атрибута у сессии еще нет


        if (sum == null)
            sum = 0;
        // Получаем параметр “n” из запроса
        String n = request.getParameter("n"); // що буде писатися в запросі
        sum += Integer.parseInt(n);

        // Записываем атрибут “sum” в сессию

        session.setAttribute("sum", sum);

        // Печатаем HTML в качестве ответа для браузера
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head> <title> CalculatorServlet </title> </head>");
        out.println("<body>");
        out.println("<h1> Sum == " + sum + "</h1>");
        out.println("</body>");
        out.println("</html>");

    }
}
