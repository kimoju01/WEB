<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogicServlet과 연동</title>
</head>
<body>

<%
	int v1 = (int)request.getAttribute("v1");
	int v2 = (int)request.getAttribute("v2");
	int result = (int)request.getAttribute("result");
%>
<%=v1 %> + <%=v2 %> = <%=result %>	<!-- 표현식 써야한다 -->

<!--  
* 	JSP에서는 자바 코드를 되도록 줄이는게 좋다.
	그래서 EL 표기법을 사용하는데 EL 표기법으루 하면
	${v1 } + ${v2 } = ${result}
	이렇게만 하면 끝난다! 
-->

</body>
</html>