<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
    
<jsp:useBean id="stu" class="student.student" />
<jsp:setProperty name="stu" property="*" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>아래는 학생 정보입니다.</h2>
	<hr>
	
	<%-- EL :: ${표현할 값} --%>
	<h3>
	이름: ${stu.getName()}		<br>
	나이: ${stu.getAge()}		<br>
	성별: <% if(stu.getGender().equals("male")){
		%>
			남성
		<%
			}
			else {
		%>
			여성
		<%
			}
		%>
	</h3>
</body>
</html>