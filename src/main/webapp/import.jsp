<%@ page import="java.util.Date" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Application</title>
</head>
<body>
<h2>Сегодня: <%= new Date() %></h2>
</body>
</html>

<%--
Директивы
Директивы предназначены для установки условий, которые применяются ко всей странице JSP. Наиболее используемая директива - это директива page. Например, с помощью атрибута import этой директивы мы можем импортировать пакеты или отдельные классы на страницу jsp.

Например, в первом коде статьи для вывода даты использовалось выражение new java.util.Date(). Но мы можем использовать данное выражение на странице многократно, либо использовать другие классы из пакета java.util. И в этом случае мы можем испортировать нужные нам классы или пакеты:

<%@ page import="java.util.Data" %>
Импорт всего пакета:

<%@ page import="java.util.*" %>
Если необходимо импортировать несколько классов и(или) пакетов, то они перечисляются через запятую:

<%@ page import="java.util.Data, java.text.*" %>
Другой полезный и часто используемый атрибут - pageEncoding, который задает кодировку jsp. Например:
--%>