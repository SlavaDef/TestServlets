package org.example.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value = "/del")
public class DelateCooliesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // щоб видалити куки потрібно їх перезаписати
        // ключ повинен співпадати значення може бути любим тобто перезапис по ключу getName
        Cookie cookie = new Cookie("someId","");

        cookie.setMaxAge(0); // щоб видалити куки потрібно встановити менший час
       // cookie.setMaxAge(-1); // куки видаляться при закритті браузера
        resp.addCookie(cookie);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
