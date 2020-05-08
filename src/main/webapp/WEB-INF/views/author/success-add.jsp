<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.05.2020
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Wyświetlanie dodanego autora</title>
</head>
<body>
<h2>Dodano do bazy nowego autora</h2>
<b>Id:       ${author.id}</b>
<p>imię:     ${author.firstName}</p>
<p>nazwisko: ${author.lastName}</p>
<a href="${pageContext.request.contextPath}/formAuthor/showAll">Powrót do strony z listą autorów.</a>
</body>
</html>
