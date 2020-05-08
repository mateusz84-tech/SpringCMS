<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.05.2020
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuwanie kategorii</title>
</head>
<body>
<h2>Usuń kategorie</h2>
<form:form method="post" modelAttribute="category" action="/formCategory/delete-bind">
    <form:label path="id">Podaj id kategorii do usunięcia: </form:label>
    <form:input path="id"/>
    <form:button>Usuń</form:button>
</form:form>
</body>
</html>
