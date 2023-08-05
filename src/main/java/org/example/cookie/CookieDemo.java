package org.example.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

//@WebServlet(value = "/cooc")
public class CookieDemo extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {

        Cookie sessionId = new Cookie("session_id", request.getRemoteAddr() + new Date());
        Cookie language = new Cookie("language", request.getLocale().toString());

        response.addCookie(sessionId);
        response.addCookie(language);

        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();

        String title = "Cookies Demo";
        String docType = "<!DOCTYPE html>";

        Cookie[] cookies = request.getCookies();

        writer.println(docType + "<html><head><title>" + title + "</title></head><body>");

        if (cookies != null) {
            writer.println("Cookies");
            for (int i = 0; i < cookies.length; i++) {
                writer.println("<hr/>");
                writer.println("Name: " + cookies[i].getName());
                writer.println("<br/>");
                writer.println("Value: " + cookies[i].getValue());
                writer.println("<hr/>");
            }
        } else {
            writer.println("No cookies");
        }
        writer.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}