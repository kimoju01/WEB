<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	List<String> list = new ArrayList<>();	//String을 담는 List 생성
	list.add("hello");
	list.add("world");
	list.add("!!!!!");
	
	request.setAttribute("list", list);	//request scope에 list 담는다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 실습 -4</title>
</head>
<body>
<!-- * items : 배열, list, map 등의 collection 
	 * var : EL에서 사용될 변수명
	 * begin : items에서 지정한 목록에서 값을 읽어올 인덱스의 시작값 (0부터 시작)
	 * end : items에서 지정한 목록에서 값을 읽어올 인덱스의 끝값 (begin, end 지정 안하면 값을 다 출력)
	-->
<c:forEach items="${list }" var="item" begin="1" end="2">	
	${item }<br>	<!-- list에 있는 값들을 담은 변수 item들을 출력 -->
</c:forEach>
</body>
</html>