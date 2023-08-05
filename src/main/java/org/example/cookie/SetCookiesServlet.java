package org.example.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/set")
public class SetCookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // створюємо куки
        // приймає два значення стринг -> name & value
        Cookie cookie1 = new Cookie("someId","123");
        Cookie cookie2 = new Cookie("someId2","456");

        cookie1.setMaxAge(24*60*60); // час який будуть куки зберігатися
        cookie2.setMaxAge(24*60*60);

        // додаємо куки в браузер к клієнту на обьекті респонс визиваємо метод

        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
