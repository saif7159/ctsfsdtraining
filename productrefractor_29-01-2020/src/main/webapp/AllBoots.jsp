<%@page import="com.boot.model.BootsDto"%>
<%@page import="com.boot.mapper.BootMapperImpl"%>
<%@page import="com.boot.mapper.BootMapper"%>
<%@page import="com.boot.model.Boots"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>All Boots</title>
</head>
<body>

<h1 class="display-2" style="text-align: center;"><b>Football Boots For You.</b></h1><br>

<h4 class="display-4" style="text-align: center;">All Available Boots.</h4>

<table class="table">
  <thead class="thead-dark">
    <tr>
      
      <th scope="col">Brand</th>
      <th scope="col">Name</th>
      <th scope="col">Size</th>
      <th scope="col">Seller Email</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
 <!--   <%
  	
    List<Boots> boots = (List<Boots>)request.getAttribute("loadboots");
  	BootMapper mapper = new BootMapperImpl();
	for(Boots b:boots){
	BootsDto bdto = mapper.bootsToBootsDto(b);
%>
    <tr>
      <td><%out.println(bdto.getUid()); %></td>
      <td><% out.println(bdto.getBrand());%></td>
      <td><% out.println(bdto.getName());%></td>
      <td><% out.println(bdto.getSize());%></td>
      <td><%out.println(bdto.getEmail());%></td>
      <td><a href=<%= "\"UpdateData.jsp?Id=" + b.getId() + "\"" %> >Update</a></td>
      
    </tr>
  <%} %> -->
  <c:forEach var ="b" items="${loadboots}" >
    <c:url var="update" value="UpdateData.do">
  	<c:param name="id" value="${b.id}"></c:param>
  	</c:url>
  	<tr>
      <td>${b.brand }</td>
      <td>${b.name }</td>
      <td>${b.size }</td>
      <td>${b.email }</td>
      <td><a href="${ update}">Update</a></td>
 
      
    </tr>
  </c:forEach>
  
  </tbody>
</table>
<br>
<h5 class="display-5" style="text-align: center;"><a href="ActionPage.html">Find your size or add a boot for sale.</a></h4>
</body>
</html>