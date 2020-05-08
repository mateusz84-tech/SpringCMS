<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.05.2020
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Aktualizacja sukces</title>
</head>
<body>
<b>Pomyślnie aktualizowano autora</b>
<b>Id:          ${author.id}</b>
<p>Imię:        ${author.firstName}</p>
<p>Nazwisko:    ${author.lastName}</p>
<a href="${pageContext.request.contextPath}/formAuthor/showAll">Powrót do strony z listą autorów.</a>
</body>
</html>
