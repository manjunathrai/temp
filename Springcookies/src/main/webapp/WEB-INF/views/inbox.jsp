<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <% Cookie c[]=(Cookie[]) request.getAttribute("name");%>
<h1>welcome <%= c[1].getValue() %></h1> --%>
<% String name =(String)request.getAttribute("name");
 String pass =(String)request.getAttribute("pass");
%>
<h1>Welcome <%= name %>  your password is <%=pass %></h1>
</body>
</html>