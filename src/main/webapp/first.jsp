<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

<title>First JSP</title>
</head>

<body>
<h1>Testing jsp</h1>
<%-- This is JSP comment  <% - для логіки, <%= для виведення  --%>
<p>

<%
java.util.Date now = new java.util.Date();
String time = "You time is  - " + now;
%>
<%= time %>
</p>
</body>
</html>