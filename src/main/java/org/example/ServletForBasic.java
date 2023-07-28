package org.example;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// http://localhost:8080/ServeletsJaaR/basic сервлет через jsp file

@WebServlet(value = "/basic")
public class ServletForBasic extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("name", "Tom"); // змінні які вносимо
        request.setAttribute("age", 34);

       /* ServletContext selvletContext = getServletContext();
        selvletContext.setAttribute("name", "Tom");
        selvletContext.setAttribute("age", 35); */ // передача через контекст

       /* HttpSession session = request.getSession();
        session.setAttribute("name", "Tom");
        session.setAttribute("age", 34); */ // передача через сесію


        // /basic.jsp" jsp файл в папці webapp

        getServletContext().getRequestDispatcher("/basic.jsp").forward(request, response);
    }


}

/*
Сервлет устанавливает два атрибута - "name" и "age" через объект HttpServletRequest
и затем перенаправляет запрос странице basic.jsp.

Если мы обратимся к сервлету HelloServlet, то он передаст запрос и данные странице basic.jsp.
 */