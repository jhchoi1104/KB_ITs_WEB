<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오전 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // 전역변수
    Integer age = null;
    // request socpe에 들어있는 속성
    request.setAttribute("age", null);
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
변수 age: <%= age%> <br>
EL age: ${age}

</body>
</html>
