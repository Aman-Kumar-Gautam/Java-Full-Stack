<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead Page</title>
</head>
<body>
	<h1>Create leads</h1>
	<form action="saveReg" method="post">
		<pre>
			First Name <input type="text" name="firstName" />
			Last Name <input type="text" name="lastName" />
			Email <input type="email" name="email" />
			Mobile <input type="text" name="mobile" />
			<input type="submit" value="save" />
		</pre>
	</form>
	${msg}

</body>
</html>