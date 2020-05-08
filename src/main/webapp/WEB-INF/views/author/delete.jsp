<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.05.2020
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuwanie autora z bazy</title>
</head>
<body>
<h2>Usuń autora</h2>
<form:form method="post" modelAttribute="author" action="/formAuthor/delete">
    <form:label path="id">Id: </form:label>
    <form:input path="id"/>
    <form:button>Usuń</form:button>
</form:form>
<a href="${pageContext.request.contextPath}/formAuthor/delete">Usuń następnego</a><br/>
<a href="${pageContext.request.contextPath}/formAuthor/add">Dodaj autora</a><br/>
<a href="${pageContext.request.contextPath}/formCategory/update">Edytuj autora</a><br/>
<a href="${pageContext.request.contextPath}/formAuthor/showAll">Pokaż wszystkich autorów</a>
</body>
</html>
