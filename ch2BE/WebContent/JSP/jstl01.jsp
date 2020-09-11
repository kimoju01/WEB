<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- JSTL을 쓰기위해 WEB-INF/lib에 taglibs- 파일 3개 넣어준다. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	<!-- JSTL을 쓸 수 있게 하는 지시자 설정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 실습 -1</title>
</head>
<body>
<c:set var="value1" scope="request" value="kang"></c:set>	<!-- 끝태그로 그냥 /> 사용해도 된다. -->
성 : ${value1 }<br> <!-- EL 표기법 -->
<c:remove var="value1" scope="request"/>	
성 : ${value1 }<br>
</body>
</html>