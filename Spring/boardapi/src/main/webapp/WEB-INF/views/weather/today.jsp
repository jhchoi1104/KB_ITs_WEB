<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-08-19
  Time: 오전 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h2>${city}</h2>
    오늘의 날씨: ${weather.weather[0].description} <img src="${iconUrl}"/>
</div>
<div>
    온도: ${weather.main.temp}° / 습도: ${weather.main.humidity}%
    가시성: ${weather.visibility}
    체감온도: ${weather.main.feels_like}°
    구름: ${weather.clouds.all}
</div>
</body>
</html>
