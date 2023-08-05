package org.example.servletsAlishev;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(value = "/hello66")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pr = resp.getWriter();

        pr.write("<html>"); // обовязково повинен бути тег відк і закр тег для веб сервлета

        pr.write("<h1> HELLO WORD! </h1>"); // чим більше число тим менший шріфт
        pr.write("</html>");

        pr.close();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // в цьому методі зазвичай пишемо якісь зміни у сервері - заміна паролю загрузка відео
    }
}
