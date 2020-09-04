<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체</title>
</head>
<body>
<%
	StringBuffer url = request.getRequestURL();
	//request와 out을 선언하지 않았는데도 실행이 된다. => 내장객체이기 때문!

	out.print("url : " + url.toString());
	out.print("<br>");
%>
</body>
</html>