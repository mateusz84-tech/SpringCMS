<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.05.2020
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edycja autorów</title>
</head>
<body>
<b>Edytuj autora</b>
<form:form method="post" modelAttribute="author" action="/formAuthor/update">
    <form:label path="id">Id: </form:label>
    <form:input path="id"/>
    <form:label path="firstName">Imię: </form:label>
    <form:input path="firstName"/>
    <form:label path="lastName">Nazwisko: </form:label>
    <form:input path="lastName"/>
    <form:button>Edytuj</form:button>
</form:form>
<a href="${pageContext.request.contextPath}/formCategory/update">Edytuj następnego</a><br/>
<a href="${pageContext.request.contextPath}/formAuthor/add">Dodaj autora</a><br/>
<a href="${pageContext.request.contextPath}/formAuthor/delete">Usuń autora</a><br/>
<a href="${pageContext.request.contextPath}/formAuthor/showAll">Pokaż wszystkich autorów</a>
</body>
</html>
