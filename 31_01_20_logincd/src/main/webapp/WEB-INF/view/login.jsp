<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<style type="text/css">
.margin{
margin: 50px;
text-align: center;
}
</style>
</head>
<body>
<h2 class="display-2" style="text-align: center;">Login</h2>
<div class="margin">
<form:form action = "processLogin" modelAttribute="user" >
<form class="dropdown-menu p-4">
  <div class="form-group">
    <label for="exampleDropdownFormEmail2" class="">Email address</label>
    <form:input type="email" path="email"  class="form-control" id="exampleDropdownFormEmail2" placeholder="name@example.com"></form:input>
  </div>
  <div class="form-group">
    <label for="exampleDropdownFormPassword2">Password</label>
    <form:input type="password" class="form-control" id="exampleDropdownFormPassword2" placeholder="Password" path="password"></form:input>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input type="checkbox" class="form-check-input" id="dropdownCheck2">
      <label class="form-check-label" for="dropdownCheck2">
        Remember me
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>
</form:form>
<h4 class="display-4">Or</h4>
<h6 class="display-6"><a href="signup">Create an account</a></h6>
</div>
</body>
=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<style type="text/css">
.margin{
margin: 50px;
text-align: center;
}
</style>
</head>
<body>
<h2 class="display-2" style="text-align: center;">Login</h2>
<div class="margin">
<form:form action = "processLogin" modelAttribute="user" >
<form class="dropdown-menu p-4">
  <div class="form-group">
    <label for="exampleDropdownFormEmail2" class="">Email address</label>
    <form:input type="email" path="email"  class="form-control" id="exampleDropdownFormEmail2" placeholder="name@example.com"></form:input>
  </div>
  <div class="form-group">
    <label for="exampleDropdownFormPassword2">Password</label>
    <form:input type="password" class="form-control" id="exampleDropdownFormPassword2" placeholder="Password" path="password"></form:input>
  </div>
  <div class="form-group">
    <div class="form-check">
      <input type="checkbox" class="form-check-input" id="dropdownCheck2">
      <label class="form-check-label" for="dropdownCheck2">
        Remember me
      </label>
    </div>
  </div>
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>
</form:form>
<h4 class="display-4">Or</h4>
<h6 class="display-6"><a href="signup">Create an account</a></h6>
</div>
</body>
>>>>>>> refs/remotes/origin/master
</html>