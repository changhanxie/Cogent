<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> this is Newfile</h1>

<jsp:useBean id="m" class="servletjsp.MyClass"></jsp:useBean> 
	
	
	
	<jsp:setProperty name="m" property="id" value="101" />
	<jsp:setProperty name="m" property="name" value="Allen" />
	
	<jsp:getProperty property="id" name="m" />
	<jsp:getProperty property="name" name="m" />
	<%=(String)m.getData() %>
	
</body>
</html>