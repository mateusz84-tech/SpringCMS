<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.05.2020
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodawanie nowego autora</title>
</head>
<body>
<h2>Dodaj nowego autora.</h2>
<form:form method="post" modelAttribute="author" action="/formAuthor/add-bind">
    <form:label path="firstName">Imię: </form:label>
    <form:input path="firstName"/>
    <form:label path="lastName">Nazwisko: </form:label>
    <form:input path="lastName"/>
    <form:button>Dodaj</form:button>
</form:form>
<a href="${pageContext.request.contextPath}/formAuthor/add">Dodaj następnego</a><br/>
<a href="${pageContext.request.contextPath}/formAuthor/update">Edytuj autora</a><br/>
<a href="${pageContext.request.contextPath}/formAuthor/delete">Usuń autora</a><br/>
<a href="${pageContext.request.contextPath}/formAuthor/showAll">Pokaż wszystkich autorów</a>

</body>
</html>
