<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sum10</title>
</head>
<body>
<!--  모든 jsp파일은 서블릿으로 바뀌어서 동작한다 --> 
<!--  line 1에 '< % @ ' 는 지시자 인데 뒤에 page가 붙어져있어서 page 지시자(지시문)이다 -->
<!--  html 안에서 프로그램을 실행시켜 주기 위해 jsp파일을 사용하는 것이기 때문에 -->
<!--  ' < % ' 부분은 scriptlet 이라고 하고 자바코드를 입력할 수 있는 부분이다 -->
<!--  ' < % = ' 부분은 표현식 이라고 한다. 응답 결과에 넣고 싶은 자바코드를 넣는 부분이다 -->
<!--  표현식 부분은 out.print(); 랑 같다고 생각하면 된다. 즉 out.print(total); 이거랑 같다. -->
<!--  jsp가 서블릿으로 바뀔 때 어떻게 바뀔까? 를 생각해보자 -->

<%
	int total = 0;
	for(int i=1; i<=10; i++) {
		total += i;
	}
%>

1부터 10까지의 합 : <%=total %>
</body>
</html>