<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<style type="text/css">
 .center {
    text-align: center;
    margin: 15px;}
</style>
<title>Update Boots.</title>
</head>
<body>
<h2 class="display-2" style="text-align: center;">Update Boots</h2><br>
<div class="center">
<form action="update.do">
<div class="form-group" style="text-align: center;">
    <label for="exampleFormControlInput1">Email address</label>
  		  
    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com" name="selleremail" value="" >
  	
  </div>
  <div class="form-group" style="text-align: center;">
    <label for="exampleFormControlSelect1">Select Boot Size</label>
    <select class="form-control" id="exampleFormControlSelect1" name="sellersize" >
      <option>6</option>
      <option>7</option>
      <option>8</option>
      <option>9</option>
      <option>10</option>
    </select>
  </div>
  
  <div class="form-group" style="text-align: center;">
    <label for="exampleFormControlTextarea1">Enter Boot Name</label>
    <input class="form-control" id="exampleFormControlTextarea1" placeholder="Boot Name" name="bootname" ></input>
  </div>
  <div class="center">
<button type="submit" class="btn btn-primary btn-circle btn-lm">Update Pair</button> 
</div>
</form>
<h5 class="display-5">Or</h5><br>
<h2 class="display-2">Delete Boot</h2>
<label></label><br>
<input>
</div>

</body>
</html>