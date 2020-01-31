<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<style type="text/css">
.margin{
margin: 50px;
text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 class="display-2" style="text-align: center;">Signup</h2>
<div class="margin">
<form:form action = "processSignup" modelAttribute="usersignup" >
<form class="dropdown-menu p-4">
  <div class="form-group">
    <label for="emailid" class="">Email address</label>
    
    <form:input type="email" path="email"  class="form-control" id="emailid" placeholder="name@example.com"></form:input><br>
    <form:errors path="email"></form:errors>
  </div>
  <div class="form-group">
    <label for="exampleDropdownFormPassword2">Password</label>
   
    <form:input type="password" class="form-control" id="exampleDropdownFormPassword2" placeholder="Password" path="password"></form:input><br>
    <form:errors path="password"></form:errors>
 </div>
  <div class="form-group">
    <label for="userage">Age</label>
   
    <form:input type="number" class="form-control" id="userage" placeholder="Age" path="age"></form:input><br>
     <form:errors path="age"></form:errors>
 </div>
 
  <button type="submit" class="btn btn-primary" style="background: green; border: none;">Sign Up</button>
</form>
</form:form>

</div>

</body>
</html>