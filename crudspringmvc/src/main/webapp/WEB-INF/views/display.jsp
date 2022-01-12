<%@page import="com.te.crud.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
	text-align: center;
}
p {
	font-size: 18.5px;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<h1>Employee details :</h1>
	<hr>
	<%
		List<Employee> emp = (List) request.getAttribute("employee");
		for (int i = 0; i < emp.size(); i++) {
	%>
	<p> | Id = <%=emp.get(i).getId() %> | First Name =<%=emp.get(i).getFirstname()%>| Last Name = <%=emp.get(i).getLastname() %> 
	| Designation = <%=emp.get(i).getDesignation() %> | Salary = = <%=emp.get(i).getSalary() %> | Date Of Joining = <%=emp.get(i).getDoj() %> 
	| Email =  <%=emp.get(i).getEmail() %>     </p>
	<%
		}
	%>
</body>
</html>