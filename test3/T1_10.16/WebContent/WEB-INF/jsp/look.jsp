<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>look Apples</title>
</head>
<body>
Apples:
<br>
<c:forEach items="${apples }" var="apple"><br>
一个苹果的信息如下：  重量：${apple.weight } 价格：${apple.price }
<br>
</c:forEach>
</body>
</html>