<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

<title>First JSP</title>
</head>

<body>
<h1>Testing jsp</h1>
<%-- This is JSP comment  <%@ %> - це директива тепер можемо импортувати щось
 також можна заимпотртити свій клас через кому, і вивести його методи
 наприклад наша програма вертає з бази данних якісь данні і через jsp ми їх виводимо --%>
<p>
<%@ page import="java.util.Date" %>

<%=
new Date()

%>

</p>

</body>
</html>