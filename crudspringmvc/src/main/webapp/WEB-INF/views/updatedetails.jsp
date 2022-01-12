<%@page import="com.te.crud.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
form{
            padding: 10px;
            width: 23%;
            margin: auto;
            height: 300px;
            background-size: cover;

        }
        input{
            float: right;
        }
        #i1{
        float: inherit;
        }
       h1{
       text-align: center;
       }
       p {
       padding: 10px;
	text-align: center;
	font-size: 16px;
	text-shadow: blue;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
<h1>Employee details : </h1>
<hr>
<% Employee emp = (Employee)request.getAttribute("employee"); %>
<p> | Id = <%=emp.getId() %> | First Name =<%=emp.getFirstname()%> | Last Name = <%=emp.getLastname() %> 
	| Designation = <%=emp.getDesignation() %> | Salary = = <%=emp.getSalary() %> | Date Of Joining = <%=emp.getDoj() %> 
	| Email =  <%=emp.getEmail() %>     </p>
<hr>
<h1>Enter the details you want to update</h1>
<hr>
<form action="./over" method="post">
	First Name : <input type="text" name="firstname"><br><br>
	Last Name : <input type="text" name="lastname"><br><br>
	Designation : <input type="text" name="designation"><br><br>
	Salary : <input type="number" name="salary"><br><br>
	Email Id : <input type="email" name="email"><br><br>
	Date of Joining : <input type="date" name="doj"><br><br>
	<input id="i1" type="submit" value="Register">
	</form>
</body>
</body>
</html>