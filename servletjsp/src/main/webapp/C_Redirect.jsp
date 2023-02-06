<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="url" value="0" scope="request" />
<c:if test="${url <1}">
<c:redirect url="http://gmail.com" />
</c:if>
<c:if test="${url >1}">
<c:redirect url="http://facebook.com" />
</c:if>
</body>
</html>