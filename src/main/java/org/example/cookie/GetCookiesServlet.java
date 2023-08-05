package org.example.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/get")
public class GetCookiesServlet extends HttpServlet {

    public GetCookiesServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // щоб отримати куки визиваємо на щапиті у кліента метод getCookies()
        Cookie[] cookies = req.getCookies(); //отримуємо куки від кліента

        PrintWriter writer = resp.getWriter();
        writer.write("<html>");
        for (Cookie cookie : cookies) { // проходимся по масиву кук
            writer.println("<h1>" + cookie.getName() + " : "+ cookie.getValue()+"</h1>");
        }

        writer.write("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    }
}
