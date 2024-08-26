<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-08-01
  Time: 오후 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>환영합니다.</h1>

<sec:authorize access="isAnonymous()">
    <a href="/security/login">로그인</a>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
    <sec:authentication property="principal.username" />
    <sec:authentication property="principal.member.birth" var="birthDate" />
    <p>생년월일: <fmt:formatDate value="${birthDate}" pattern="yyyy-MM-dd" /></p>
    <form action="/security/logout" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <input type="submit" value="로그아웃" />
    </form>
</sec:authorize>
<br>

<a href="/security/admin">Admin 페이지 이동</a>
<a href="/security/member">Member 페이지 이동</a>
</body>
</html>
