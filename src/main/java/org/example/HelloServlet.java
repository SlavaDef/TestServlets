package org.example;

import java.lang.Math;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;


//@WebServlet(value = "/*")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print("<html>  ");
        out.print("<body> ");
        double num = Math.random();
        String date = new SimpleDateFormat(" yyyy-MM-dd HH:mm:ss ").format(new Date());
      // якщо випадкове число буде більшим то напечатається lukki + дата + число якщо ні то інше
        if (num > 0.95) {
            out.print("<h2> You is lucky, user! </h2> <p> (" + num + ")</p> ");
            out.print(date);
        } else {
            out.print("<h2> Today is't your day, user! </h2> <p> (" + num + ")</p> ");
            out.print(date);
        }
        out.print("</body> ");
        out.print("</html> ");
    }
}

/*
Analog on html
 <%@ page import="java.util.Date" %>
    <%@ page import="java.lang.Math" %>
    <%@ page extends="com.javarush.MyHttpServlet" %>

    <html>
    <body>
    <%
        double num = Math.random();
        if (num > 0.95) {
     %>
         <h2>Ты счастливчик, user!</h2><p>(<%= num %>)</p>
    <%
    }
    %>
  </body>
   </html>

 */
