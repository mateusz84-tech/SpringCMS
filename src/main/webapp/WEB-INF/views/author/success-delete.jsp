<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.05.2020
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuwanie sukces</title>
</head>
<body>
<h2>Usunięto autora o id : ${author.id}</h2>
<a href="${pageContext.request.contextPath}/formAuthor/showAll">Powrót do strony z listą autorów.</a>
</body>
</html>
