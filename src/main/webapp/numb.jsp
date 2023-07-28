<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>First JSP App</title>
    </head>
    <body>
        <p>2 + 2 = <%= 2 + 2 %></p>
        <p>5 > 2 = <%= 5 > 2 %></p>
        <p><%= new String("Hello").toUpperCase() %></p>
        <p>Today <%= new java.util.Date() %></p>
    </body>
</html>