<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="newReg" method="post">
		<pre>
			name <input type="text" name="name" />
			city <input type="text" name="city" />
			email <input type="email" name="email" />
			mobile <input type="text" name="mobile" />
			<input type="submit" value="Save" />
		</pre>


	</form>

	<%if(request.getAttribute("msg")!=null)
	{
	out.println(request.getAttribute("msg"));
	}

%>
</body>
</html>