<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
table {
	float: left;
}
th {
	border-bottom: 1px solid black;
	text-align: left;
}
</style>
<body>

	<h2>Search for User</h2>

	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
		</tr>
		<tr>
			<td>${userSearch.id}</td>
			<td>${userSearch.name}</td>
			<td>${userSearch.email}</td>
			<td>${userSearch.address}</td>
		</tr>
	</table>
	<br>
	<br>
	<form:form action="userupdate" method="post" commandName="userupdate">
		<h3>Update User</h3>
			<p>User ID: ${userSearch.id}</p>
			<input type="hidden" name="id" id="id" value="${userSearch.id}" required/>
			<label for="name">New Name:</label><br/>
			<input type="text" name="name" id="name" value="${userSearch.name}" required/><br>
			<label for="email">New Email:</label> <br/>
			<input type="text" name="email" id="email" value="${userSearch.email}" required/><br>
			<label for="address">New Address:</label><br/>
			<input type="text" name="address" id="address" value="${userSearch.address}" required/><br><br>
			<input type="submit" value="Submit"/>
	</form:form>
	<br>
	<br>
	<a href="index.jsp">Back to Menu</a>
</body>
</html>