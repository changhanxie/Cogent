<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:url value="/index.jsp" var="completeURL">
<c:param name="trackingId" value="100" />
<c:param name="user" value="ABC" />
</c:url>
${completeURL}


</body>
</html>