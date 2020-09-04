<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언문 예제</title>
</head>
<body>
id : <%=getId() %>			<!-- out.print(getId())랑 같다 -->
<%!
	String id = "kim"; 		//멤버(전역)변수 선언
	public String getId() {	//메서드 선언
		return id;
	}
%>
</body>
</html>