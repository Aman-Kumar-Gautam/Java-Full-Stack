<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead Page</title>
</head>
<body>
	<h1>Update leads</h1>
	<form action="updateReg" method="post">
		<pre>
			Id <input type="hidden" name="id" value="${registration.id}"/>
			First Name <input type="text" name="firstName"  value="${registration.firstName}"/>
			Last Name <input type="text" name="lastName"  value="${registration.lastName}"/>
			Email <input type="email" name="email"  value="${registration.email}"/>
			Mobile <input type="text" name="mobile"  value="${registration.mobile}"/>
			<input type="submit" value="Update" />
		</pre>
	</form>
	${msg}

</body>
</html>