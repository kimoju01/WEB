<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- 
<%
	request.setAttribute("n", 10);
%> 
윗 줄과 아랫줄은 같은 내용이다!
--%>
<c:set var="n" scope="request" value="10"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 실습 -2</title>
</head>
<body>
<c:if test="${n == 0 }">	<!-- JSTL안에 EL표기법으로 표기 -->
	n과 0은 같습니다.		<!-- 조건이 true라면 안에 내용을 실행한다 -->
</c:if>
<c:if test="${n == 10 }">
	n과 10은 같습니다.
</c:if>
</body>
</html>