<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주석(comment) 예제</title>
</head>
<body>
<%-- jsp 주석
	jsp 페이지에서 사용할 수 있는 주석 : HTML, java, jsp 전부 다 사용 가능
	jsp 주석 : 서블릿으로 안 바뀐다.
 --%>
<!-- html 주석 : 자바로 바뀌고 자바로 실행도 된다.
	html을 보여줄 때 화면에 안 보임.
	-->
<%
//java 주석 : 자바로 바뀌는데 실행은 안 된다.
/*
	각각의 경우에 따라 주석이 하는 역할 -> 주석이 주석일 때 위치가 다를 수 있다.
*/
	for(int i=1; i<=5; i++) {
%>
<h<%=i %>>오잉</h>
<%
	}
%>
</body>
</html>