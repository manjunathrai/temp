<%@page import="com.te.springMvc.model.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
<%Register reg = (Register) request.getAttribute("details"); %>
<h1 align="center" style="color: red;"> <%= reg.getName() %> Registered Successfully!!!!!!!!!!  </h1>
<hr>
<h1 align="center"> Email = <%=reg.getEmail()  %>, Phone number = <%=reg.getPhone() %></h1>
</body>
</html>