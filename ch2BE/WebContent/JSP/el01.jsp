<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	pageContext.setAttribute("p1", "page scope value");	//"p1"의 값으로 그냥 문자열을 넘겨준다.
	request.setAttribute("r1", "request scope value");
	session.setAttribute("s1", "session scope value");
	application.setAttribute("a1", "application scope value");
%>
<html>
<head>
<meta charset="UTF-8">
<title>el 실습</title>
</head>
<body>
pageContext.getAttribute("p1") : <%=pageContext.getAttribute("p1") %><br>	<!-- JSP 표기법. 아래랑 같은 의미다. -->
pageContext.getAttribute("p1") : ${pageScope.p1 }<br> <!-- EL 표기법. pageScope가 가진 p1을 출력한다. -->
pageContext.getAttribute("p1") : ${p1 }<br> <!-- 값 이름이 중복되지 않으면 p1 이라고만 적어도 괜찮다. -->

request.getAttribute("r1") : ${requestScope.r1 }<br>
request.getAttribute("r1") : ${r1 }<br>

session.getAttribute("s1") : ${sessionScope.s1 }<br>
session.getAttribute("s1") : ${s1 }<br>

application.getAttribute("a1") : ${applicationScope.a1 }<br>
application.getAttribute("a1") : ${a1 }<br>
</body>
</html>