<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 실습 -7</title>
</head>
<body>
<c:set var="t" value="<script type='text/javascript'>alert(1);</script>"/>
<c:out value="${t }" escapeXml="false"/>	<!-- escapleXml=true이면 set의 value를 태그로 인식하지않고 그냥 문자 그대로 출력해준다. -->
<!-- 
윗 줄과 ${t } 은 같은 의미이다.
 -->
</body>
</html>