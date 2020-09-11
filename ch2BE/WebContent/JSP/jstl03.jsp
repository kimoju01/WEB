<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setAttribute("score", 83);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 실습 -3</title>
</head>
<body>
<c:choose>
	<c:when test="${score >= 90 }">
		A 학점입니다.
	</c:when>
	<c:when test="${score >= 80 }">
		B 학점입니다.
	</c:when>
	<c:when test="${score >= 70 }">
		C 학점입니다.
	</c:when>
	<c:when test="${score >= 60 }">
		D 학점입니다.
	</c:when>
	<c:otherwise>
		F 학점입니다.	<!-- when의 조건이 모두 만족하지 않을 때 실행 -->
	</c:otherwise>	
</c:choose>
</body>
</html>