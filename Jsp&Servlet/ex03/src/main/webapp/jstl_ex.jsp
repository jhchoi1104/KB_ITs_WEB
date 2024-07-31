<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오전 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%@ include file="navbar.jsp"%>
<%--<jsp:include page="navbar.jsp"></jsp:include>--%>

<c:if test="${role=='ADMIN'}">관리자</c:if>
<c:if test="${role!='ADMIN'}">일반회원</c:if>

<table>
    <c:forEach var="member" items="${members}" varStatus="state">
        <tr>
            <td>${state.index}</td>
            <td>${member.name}</td>
            <td>${member.passwd}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
