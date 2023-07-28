<%@page import="org.metanit.example.jspCalculator.Calculator"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>JSP Application</title>
    </head>
    <body>
        <h2>Square of 3 = <%= new Calculator().square(3) %></h2>
    </body>
</html>