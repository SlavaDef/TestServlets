package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// http://localhost:8080/ServeletsJaaR/hello?nums=1&nums=2&nums=3. -> Numbers: 1 2 3

//@WebServlet("/hello")
public class HelloServletMassiv extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
// getParameterValues() - for massivs
        String[] nums = request.getParameterValues("nums"); // nums що писати в запросі

        try {
            writer.print("<h2>Numbers: ");
            for (String n : nums)
                writer.print(n + " ");
            writer.println("</h2>");
        } finally {
            writer.close();
        }
    }
}
/*
Если в сервлет передается массив значений, то для его получения у объекта HttpServletRequest
применяется метод getParameterValues(), который получает название параметра и возвращает
массив строк. В данном случае мы ожидаем, что параметр будет называться nums. Затем значения
из этого параметра в цикле передаются в ответ клиенту.
 */