<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- "000님 반갑습니다." 출력 -->
	<%
		String name=request.getParameter("name");
	%>
	<h1><%=name %>님 반갑습니다.</h1>
	<hr>
	
	<!-- 대상자인지 아닌지를 파일을 불러오면서 표현 -->
	<%
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		System.out.println(gender);
		
		if(gender.equals("female")&&(age>=20 && age<40)){
	%>
			<%@ include file="Ex_success.jsp" %>
	<%
		}
		
		else {
	%>
			<%@ include file="Ex_fail.jsp" %>
	<%
		}
	%>
	
</body>
</html>



