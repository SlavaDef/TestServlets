package org.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@WebServlet(value = "/*")
public class Redirect extends HttpServlet { // сервелет для перенаправлення на гугл + текст

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            // перенаправить на сторінку насвйті
            String newUrl = "https://senior-pomidor.com.ua/1/31/gazonnye_travy.html";
            // перенаправить на google
            //String newUrl = "http://google.com?q=Try to lern googlit";
            String redirectUrl = response.encodeRedirectURL(newUrl);
            response.sendRedirect(redirectUrl);

    }
}
