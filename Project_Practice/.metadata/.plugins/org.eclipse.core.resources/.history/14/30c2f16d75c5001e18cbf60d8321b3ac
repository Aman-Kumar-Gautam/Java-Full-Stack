<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%! 
	public int x = 10;
	public int test(){
		return 100;
	}
	%>
	
	<% 
	// Scriplet Tag
	
	
	System.out.println("Hello World"); 
	for(int i=0; i<10; i++){
		System.out.println(i);
	}
	int z = 104;
	%>
	
	
	
	<%=x 
	
	%>
	<%out.println("Implicit: "+x); %>
	<%=test() %>
	
	
	<%=new Date() %>
	<% 
	ArrayList data= new ArrayList();
	data.add(10);
	data.add(120);
	for (int i = 0; i<data.size(); i++){
	%>
	<br>
	<% out.println(data.get(i));
		
	}%>
	
	
	
</body>
</html>