<%!
    int square(int n){
        return n * n;
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>First JSP App</title>
    </head>
    <body>
        <p><%= square(6) %></p>
        <ul>
        <%
            for(int i = 1; i <= 5; i++){
                out.println("<li>" + square(i) + "</li>");
            }
        %>
        </ul>
    </body>
</html>
