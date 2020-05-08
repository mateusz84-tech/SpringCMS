<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.05.2020
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edycja kategorii</title>
</head>
<body>
<h2>Edytowanie kategorii</h2>
<form:form method="post" modelAttribute="category" action="/formCategory/update-bind">
    <form:label path="id">Id: </form:label>
    <form:input path="id"/>
    <form:label path="name">Rodzaj kategorii: </form:label>
    <form:input path="name"/>
    <form:label path="description">Opis: </form:label>
    <form:input path="description"/>
    <form:button>Edytuj</form:button>
</form:form>
</body>
</html>
