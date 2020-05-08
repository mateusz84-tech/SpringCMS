<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.05.2020
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie nowej kategorii</title>
</head>
<body>
<h2>Dodaj nową kategorie.</h2>
<form method="post">
    <lable for="name">Nazwa: </lable>
    <input id="name" type="text" name="name"/>
    <label for="description">Opis: </label>
    <input id="description" type="text" name="description"/>
    <button type="submit" value="Dodaj"></button>
</form>
<h2 style="color: crimson">Dodaj nową kategorie. Formularz zbindowany.</h2>
<form:form method="post" modelAttribute="category" action="/formCategory/add-bind">
    <form:label path="name">Rodzaj kategorii: </form:label>
    <form:input path="name"/>
    <form:label path="description">Opis kategorii: </form:label>
    <form:textarea path="description" rows="3" cols="20"/>
    <form:button>Dodaj</form:button>
</form:form>
</body>
</html>
