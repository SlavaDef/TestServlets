<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>User Info</title>
    </head>
    <body>
        <p>Name: <%= request.getParameter("name") %></p>
        <p>Age: <%= request.getParameter("age") %></p>
    </body>
</html>

<%--
request = http://localhost:8080/postuser.jsp?name=Bob&age=29

В данном случае мы получаем два параметра: name и age.

Запустим приложение и передадим странице данные через строку запроса postuser.jsp?name=Bob&age=29:
Если для определенного параметра не передается значение, то страница получает значене null:

--%>