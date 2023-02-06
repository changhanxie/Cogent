<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
<title>Insert title here</title>
</head>
<body>

<c:forEach var="j" begin="1" end="3">
	<p>item <c:out value="${j}" /><p>
</c:forEach>

</body>
</html>