<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="http://localhost:8090/ch2BE/JSP/jstlValue.jsp" var="urlValue" scope="request"></c:import>
<c:import url="http://www.google.co.kr" var="googleValue" scope="request"></c:import>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 실습 -5</title>
</head>
<body>
<!-- import 태그를 이용해 url에 있는 값을 변수 urlValue에 저장해서 읽어온다 -->
${urlValue }<br>	<!-- jstlValue.jsp에 내용이 hi라서 hi가 출력될 것 -->
${googleValue }<br>
</body>
</html>