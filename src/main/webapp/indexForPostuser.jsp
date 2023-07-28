<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Form</title>
</head>
<body>
<form action="postuser.jsp">
    Name: <input name="name" />
    <br><br>
    Age: <input name="age" type="number" min=1 />
    <br></br>
    <input type="submit" value="Submit" />
</form>
</body>
</html>

<%--
Подобным образом можно получать данные из отправленных форм. Например, определим в проекте файл
В данном случае форма предназначена для ввода имени и возаста пользователя.
 И по нажатию на кнопку данные формы уходят странице postuser.jsp.
 Таким образом, после ввода данных и их отправке на странице index.html эти
 данные будут получены скриптом postuser.jsp:

--%>