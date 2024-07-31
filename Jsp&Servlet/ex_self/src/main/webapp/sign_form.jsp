<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오후 4:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user" method="get">
    <fieldset>
        <ul>
            <li>
                <label for="userid">아이디</label>
                <input type="text" id="userid" name="userid">
            </li>
            <li>
                <label for="passwd">비밀번호</label>
                <input type="text" id="passwd" name="passwd">
            </li>
            <li>
                <label for="birthday">생년월일</label>
                <input type="text" id="birthday" name="birthday">
            </li>
            <li>
                <label for="age">나이</label>
                <input type="text" id="age" name="age">
            </li>
            <li>
                <label for="habit">취미</label>
                <input type="text" id="habit" name="habit">
            </li>
            <li>
                <label for="star">별자리</label>
                <input type="text" id="star" name="star">
            </li>
            <li>
                <input type="submit" value="전송">
            </li>
        </ul>
    </fieldset>
</form>
</body>
</html>
