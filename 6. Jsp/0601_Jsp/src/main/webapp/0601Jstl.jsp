<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
	<%-- JSTL :: html 코드 상에서 자바 문법 사용 용이하게 함 --%>
	<% 
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		
		boolean tf=gender.equals("female") && age>=20 && age<40;
	%>
	
	<h1><%=name %>님 반갑습니다.</h1>
	<hr>
	
	<c:set var="tf" value="<%=tf %>"/>
	
	<c:choose>
		<c:when test="${tf}">
			<%@ include file="Ex_success.jsp" %>
		</c:when>
		<c:otherwise>
			<%@ include file="Ex_fail.jsp" %>
		</c:otherwise>
	</c:choose>
</body>
</html>



