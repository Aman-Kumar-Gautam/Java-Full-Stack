<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Registration</title>
</head>
<body>
	<h2>All Registration</h2>
	<table>
		<tr>
			<th>Name</th>
			<th>City</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Action</th>
			<th>Update</th>
		</tr>
		<%
		ResultSet result = (ResultSet) request.getAttribute("result");
		while (result.next()) {
		%>
		<tr>
		<td><%=result.getString(1)%></td>
		<th><%=result.getString(2)%></th>
		<th><%=result.getString(3)%></th>
		<th><%=result.getString(4)%></th>
		<th>
		<a href="delete?email=<%=result.getString(3)%>">delete</a>
		<a href="update?email=<%=result.getString(3)%>&mobile=<%=result.getString(4)%>">update</a>
		
		</tr>
		<%}%>
	</table>

</body>
</html>