<%@page import="com.boot.model.BootsDto"%>
<%@page import="com.boot.mapper.BootMapperImpl"%>
<%@page import="com.boot.mapper.BootMapper"%>
<%@page import="com.boot.model.Boots"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>All Boots</title>
</head>
<body>
<h1 class="display-2">All Boots</h1>

<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Brand</th>
      <th scope="col">Name</th>
      <th scope="col">Size</th>
      <th scope="col">Seller Email</th>
    </tr>
  </thead>
  <tbody>
  <%List<Boots> boots = (List<Boots>)request.getAttribute("allboots");
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
    </tr>
  <%} %>
  </tbody>
</table>

</body>
</html>