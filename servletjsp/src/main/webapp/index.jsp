<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="employeeForm.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>hello</p>


	<jsp:include page=retrive.jsp></jsp:include>
	<jsp:param value="Allen" name="name" /> 
	
	</jsp:forward>
</body>
</html>