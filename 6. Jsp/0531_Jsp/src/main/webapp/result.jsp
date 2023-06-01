<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>계산기 프로그램</h1>
	<hr>
	
	<%
		// 문자열로 입력받은 숫자 int형으로 파싱
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		String op=request.getParameter("op");	// 연산자
		
		int result=0;
		switch(op){
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		case "%":
			result=num1%num2;
			break;
		}
	%>
	
	<h3><%=op%> 결과는 <%=result %></h3>
</body>
</html>


