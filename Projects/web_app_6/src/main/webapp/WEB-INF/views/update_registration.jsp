<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
	<form action="update" method="post">
		<pre>
			
			
			Email <input type="email" name="email"
				value="<%=request.getAttribute("email")%>"/>
			Mobile <input type="text" name="mobile"
				value="<%=request.getAttribute("mobile")%>"/>
			<input type="submit" value="Update" />
		</pre>


	</form>

	<%
	if (request.getAttribute("msg") != null) {
		out.println(request.getAttribute("msg"));
	}
	%>
</body>
</html>