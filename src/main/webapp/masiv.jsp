<%
    String[] people = new String[]{"Tom", "Bob", "Sam"};
    String header = "Users list";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>First JSP App</title>
    </head>
    <body>
        <h3><%= header %></h3>
        <ul>
        <%
            for(String person: people){
                out.println("<li>" + person + "</li>");
            }
        %>
        </ul>
    </body>
</html>

<%--
Другой пример - определим переменную и массив и выведим их содержимое на страницу:
В скриплете в начале страницы определяются две переменных - переменная типа String и массив строк.
С помощью второго скриплета содержимое массива через цикл for выводится на страницу.
https://metanit.com/java/javaee/3.3.php
--%>