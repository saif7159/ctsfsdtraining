<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<style type="text/css">
 .center {
    text-align: center;
    margin: 15px;}
</style>
<title>Add CD</title>
</head>
<body>
<h2 class="display-2" style="text-align: center;">Add a new CD to Collection</h2>
<form action="processCD" method="post">
<div class="form-group" style="text-align: center;">
	
    <label for="exampleFormControlInput1">Movie Name</label>
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Forrest Gump" name="cdname" value="" >
  	
  </div>
  <div class="form-group" style="text-align: center;">
    <label for="exampleFormControlSelect1">Select Genre</label>
    <select class="form-control" id="exampleFormControlSelect1" name="cdgenre" >
      <option>Drama</option>
      <option>Action</option>
      <option>Film - Noir</option>
      <option>Comedy</option>
      <option>Thriller</option>
    </select>
  </div>
  
  <div class="form-group" style="text-align: center;">
    <label for="exampleFormControlSelect2">CD Type</label>
      <select class="form-control" id="exampleFormControlSelect2" name="cdtype" >
      <option>Hollywood</option>
      <option>Bollywood</option>
      <option>Foreign</option>
     
    </select>
  </div>
  <div class="center">
<button type="submit" class="btn btn-primary btn-circle btn-lm">Update Collection</button> 
</div>


</div>
</form>
</body>
</html>