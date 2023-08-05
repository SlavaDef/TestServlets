<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

<title>First JSP</title>
</head>

<body>
<h1>Testing jsp</h1>
<%-- This is JSP comment  request.getParameter("name"); - задаємо параметр і виводимо його
http://localhost:8080/ServeletsJaaR/getName.jsp?name=Bob&surname=Iq отримаємо Hello, Bob Iq
в данному прикладі задали два параметри --%>
<p>

<%
String name = request.getParameter("name");
String surname = request.getParameter("surname");
%>

<%= "Hello,  " + name + " " + surname %>

</p>
</body>
</html>