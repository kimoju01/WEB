<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	response.sendRedirect("redirect02.jsp");
%>
</body>
</html>
<!-- 
1. 웹브라우저가 WAS(redirect01.jsp)에 redirect01.jsp 요청
2. WAS(redirect01.jsp)가 웹브라우저에 redirect02로 리다이렉트 요청
	(응답코드:302, Location 헤더 값:redirect02.jsp)
3. 웹브라우저는 WAS(redirect02.jsp)의 리다이렉트 요청을 받고 redirect02.jsp를 요청
4. WAS(redirect02.jsp)는 웹브라우저에 redirect02 결과 출력
5. 브라우저 주소창의 URL주소는 redirect02.jsp로 바뀐다.
** 요청이 2번 들어간다는게(request, response 객체가 2번 만들어진다) 중요하다 **
-->