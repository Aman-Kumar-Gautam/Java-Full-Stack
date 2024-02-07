<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addController" method="post">
		num1 <input type="text" name="num1" /> num2 <input type="text"
			name="num2" /> <input type="submit" value="add" />
	</form>
	
	
	
	<%	if(request.getAttribute("res")!=null){
		out.println(request.getAttribute("res")); 
	}
	%>
</body>
</html>