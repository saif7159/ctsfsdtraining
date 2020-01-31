<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
CD Name:${cd.name}<br/>
CD Genre:${cd.genre }<br/>
CD Type:${cd.type}<br/>
<a href="${pageContext.request.contextPath}/">goHome</a>
</body>
</html>