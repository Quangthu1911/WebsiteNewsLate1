<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
 <!-- <form class="form-horizontal" method="post" action="save-tasks" enctype="multipart/form-data">  -->
<div class="container">
  <h2>Thêm bài báo mới</h2>
  <p></p>
  <form method="post" action="save-tasks" enctype="multipart/form-data">
   
    <div class="form-group">
      <label >title:</label>
      <input type="text" class="form-control" name="title" >		
    </div>
    <div class="form-group">
      <label >image:</label>
      <input type="file" class="form-control" name="image1">	
    </div>
    <div class="form-group">
      <label >quote:</label>
      <input type="text" class="form-control" name="quote">	
    </div>
    <div class="form-group">
      <label >content:</label>
      <!-- <input type="text" class="form-control" name="content">		 -->
      <textarea rows="5" cols="48" class="form-control" name="content">	</textarea>	
    </div>
    <div class="form-group">
      <label >ID Category:</label>
      <input type="text" class="form-control" name="idcategory">
    </div>
    <div class="form-group">
		<input type="submit" class="btn btn-primary" value="save">
	</div>
    
  </form>
</div>
</body>
</html>