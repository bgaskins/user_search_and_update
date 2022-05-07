<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Search</title>
</head>
<body>
<h2 class="hello-title">Hello! Let's begin your User search.</h2>
<form action="search/{id}" method="post">
Enter User ID Number: <input name="id" type="text" id="id" placeholder="ID #" required>
<input name="Submit" type="Submit">
</form>
<a href="users.jsp">View All Users</a>
</body>
</html>