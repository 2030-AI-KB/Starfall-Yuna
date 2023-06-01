<%@ page import="java.util.Scanner" errorPage="error.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Jsp :: Java Server Pages 
		html 파일 안에서 Java 언어를 작성O -> 수정O -->
	
	<!-- html 주석 :: 화면에서는 안 나오고, 소스보기에선 나옴-->
	<%-- Jsp 주석 :: 화면에도 소스보기도 안 나옴 --%>
	
	<!-- 디렉티브(지시어) :: Jsp 파일의 속성 지정 -->
	<%-- 1. page 지시어 :: <%@ page %> --%>
	<%-- 2. include 지시어 :: <%@ include file="파일명" %> --%>
	<%-- 3. taglib 지시어 :: <%@ taglib %> --%>
	
	<!-- 스크립트 요소 :: html 파일에 Java 코드 작성시 사용 -->
	<%-- 1. 선언 태그 --%>
	<%!
		int n1=1;
		int n2=2;
	%>
	<%-- 2. 표현 태그 --%>
	<h1>n1과 n2의 합은 <%=n1+n2 %></h1>
	<%-- 3. <% %> --%>
	<%
		int a;	int b;
		System.out.println("a와 b를 선언하였습니다.");
		a=5;
		b=1;
		System.out.println("a와 b의 합은 "+(a+b)+"입니다.");
	%>
</body>
</html>



