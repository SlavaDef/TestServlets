<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

<title>First JSP</title>
</head>

<body>
<h1>Testing jsp</h1>
<%-- This is JSP comment - запит назва jsp файлу.jsp http://localhost:8080/ServeletsJaaR/second.jsp
юзаємо метод out для виведення змінних.
"<p>" + "</p>" переведе вираз на новий рядок + не забуваемо про двакрапку з комою --%>
<p>

<%
for (int i=0; i<10; i++){
out.println("<p>" + " Helo from second jsp : " + i + "</p>");
out.println("<p>" +"Your IP address is " + request.getRemoteAddr() + "</p>");
}
%>

</p>
</body>
</html>