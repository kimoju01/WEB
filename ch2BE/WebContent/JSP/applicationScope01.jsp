<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application Scope 실습</title>
</head>
<body>
<%
	try {	//value가 없다면 오류 발생하기 때문에 예외처리
		int value = (int)application.getAttribute("value");
		value = value + 2;
		application.setAttribute("value", value);
%>
		<h1><%=value %></h1>
<% 
	} catch (NullPointerException e) {
%>
		<h1>설정된 값이 없습니다.</h1>
<% 
	}
%>
</body>
</html>