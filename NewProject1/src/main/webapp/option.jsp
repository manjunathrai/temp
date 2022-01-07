<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Result Page</h1>
<hr>
<h1></h1>
<%
     PrintWriter writer = response.getWriter();
     int num1 = Integer.parseInt(request.getParameter("num 1"));
     int num2 = Integer.parseInt(request.getParameter("num 2"));
     String s = request.getParameter("option");
     if(s.equals("add"))
    	 writer.println("<body bgcolor='cyan'><h1>"+(num1+num2)+"</h1></body>");
     else if(s.equals("sub"))
    	 writer.println("<body bgcolor='cyan'><h1>"+(num1-num2)+"</h1></body>");
     else if(s.equals("mul"))
    	 writer.println("<body bgcolor='cyan'><h1>"+(num1*num2)+"</h1></body>");
     else if(s.equals("div"))
    	 writer.println("<body bgcolor='cyan'><h1>"+(num1/num2)+"</h1></body>");
     else
    	 writer.println("<body bgcolor='cyan'><h1>"+(num1%num2)+"</h1></body>");
%>

<%= %>
</body>
</html>