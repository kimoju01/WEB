<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp lifecycle</title>
</head>
<body>
hello
<%
	System.out.print("jspService()");
%>

<!-- ' < % ! ' 선언문(Declaration)이라고 부르는데 service 메서드 내에 만들어지지않고
	service 메서드 바깥쪽에 해당 코드들이 만들어지게 할 수 있다. 
	전역변수 선언 및 메서드 선언에 사용한다. -->

<%! 
	public void jspInit() {
	System.out.print("jspInit()");
}
%>

<%!
	public void jspDestroy() {
	System.out.print("jspDestroy()");
	}
%>
</body>
</html>