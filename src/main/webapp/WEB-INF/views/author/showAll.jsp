<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08.05.2020
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista wszystkich autorów.</title>
</head>
<body>
<form:form method="get" modelAttribute="listOfAuthors">
    <table>
        <th>${listOfAuthors}</th><br/>
    </table>
</form:form>
<a href="${pageContext.request.contextPath}/formAuthor/add">Dodaj autora</a><br/>
<a href="${pageContext.request.contextPath}/formAuthor/delete">Usuń autora</a><br/>
<a href="${pageContext.request.contextPath}/formAuthor/update">Edytuj autora</a><br/>
</body>
</html>
