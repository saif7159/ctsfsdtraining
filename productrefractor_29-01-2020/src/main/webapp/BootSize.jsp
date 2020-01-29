
<%@page import="com.boot.model.Boots"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>The Size For You</title>
</head>
<body>
<h1 class="display-2" style="text-align: center;">Size For You.</h1>
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
<%
List<Boots> boots = (List<Boots>)request.getAttribute("bootsize");
int i = 0;
for(Boots b:boots){
	i++;
%>
    <tr>
      <td><%out.println(i);%>
      <td><%out.println(b.getBrand()); %></td>
      <td><%out.println(b.getName()); %></td>
      <td><%out.println(b.getSize()); %></td>
      <td><%out.println(b.getEmail()); %></td>
    </tr>
<%} %>  
  </tbody>
</table>


</body>
</html>