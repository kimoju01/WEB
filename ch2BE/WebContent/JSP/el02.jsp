<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> <!-- EL 표기법을 쓰지 않으려면 true로 변경 -->
<%
	request.setAttribute("k", 10);	//"k" 값에 10을 준다
	request.setAttribute("m", true);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 실습 -2</title>
</head>
<body>
k : ${k }<br>
k + 5 : ${k + 5 }<br>
k - 5 : ${k - 5 }<br>
k * 5 : ${k * 5 }<br>
k / 5 : ${k div 5 }<br> <!-- / 는 인식 못 할 수도 있어서 예약어로 대체 -->

k : ${k }<br>
m : ${m }<br>

k > 5 : ${k > 5 }<br> 
k < 5 : ${k < 5 }<br>
k >= 5 : ${k >= 5 }<br>
k <= 5 : ${k <= 5 }<br>

m : ${m }<br>
!m : ${!m }<br>
</body>
</html>