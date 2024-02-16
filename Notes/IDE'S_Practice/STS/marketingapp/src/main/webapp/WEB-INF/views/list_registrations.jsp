<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Registrations</title>
</head>
<body>
	<table>
		<tr>
			<th>S. No.</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th> 
		</tr>
		<c:forEach var="registrations" items="${registrations}">
			<tr>
				<td>${registrations.id}</td>
				<td>${registrations.firstName}</td>
				<td>${registrations.lastName}</td>
				<td>${registrations.email}</td>
				<td>${registrations.mobile}</td>
				<td><a href="delete?id=${registrations.id}">Delete</a></td>
				<td><a href="update?id=${registrations.id}">Update</a></td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>