<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach var ="cd" items="${list}" >

CD Name:${cd.name}<br/>
CD Genre:${cd.genre }<br/>
CD Type:${cd.type}<br/>

  </c:forEach>
  <a href="${pageContext.request.contextPath}/">goHome</a>
</body>
</html>