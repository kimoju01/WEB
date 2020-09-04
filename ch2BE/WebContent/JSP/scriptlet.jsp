<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트릿(scriptlet) 예제</title>
</head>
<body>
<%
	for(int i=1; i<=5; i++) {
%>
<%-- 요건 JSP 주석! html 소스보기 해도 표시되지 않는다! --%>
<%-- 스크립트릿을 쪼개서 쓸 수도 있다.(이어진다) --%>
<h<%=i %>>오잉</h>
<%
	}
%>
</body>
</html>