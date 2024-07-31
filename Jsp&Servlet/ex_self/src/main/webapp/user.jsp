<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오후 4:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${empty loginDTO}">
    <a href="/login_form.jsp">로그인</a> | <a href="sign_form.jsp">회원가입</a>
</c:if>
<c:if test="${!empty loginDTO}">
    <a href="/logout">로그아웃</a>
</c:if>
<h1>사용자 정보</h1>
<c:if test="${!empty loginDTO}">
    사용자 아이디: ${user.userid}<br>
    비밀번호: ${user.passwd}<br>
    생년월일: ${user.birthday}<br>
    나이: ${user.age}<br>
    취미: ${user.habit}<br>
    별자리: ${user.star}<br>

    <a href="/sign_form.jsp">사용자 정보 수정</a>
</c:if>

</body>
</html>
