<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
form{
width: 60%;
margin-left: 50px;
}
h1{
text-align: center;
}

#i1{
float: right;
}
a{
float: right; 
font-size: 20px; 
 text-decoration: none;
 color: black;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>New Mail</title>
</head>
<body bgcolor="silver">
	<h1>New Mail</h1>
	<hr>
	<h4>
	<a href="./home">Home</a>
	</h4>
	<br>
	<div>
	<form  action="./send" method="post">
	From : <input  style="margin-left: 75px;" type="email" name="fromemail" value= <%=request.getAttribute("email") %>  placeholder="sender mail"><br><br>
	To : <input style="margin-left: 92.5px;" type="email" name="toemail" placeholder="Reciver mail"><br><br>
	<label for="subject">Subject :</label>
	 <textarea style="margin-left: 60px; font-size: 15px; padding-top: 5px; padding-bottom: 5px" name="subject"  cols="70" rows="1" ></textarea><br><br>
	  <label for="Message">Message:</label><br>
        <textarea style="margin-left: 120px;" name="message"  cols="90" rows="30"></textarea><br><br>
	<input id="i1" type="submit" value="Send" name= "status" ><br><br>
	<input id="i1" type="submit" value="Cancel"  name= "status" ><br><br>
	<input id="i1" type="submit" value="Discard"  name= "status" >
	
	</form><br><br>
	
	</div>
	 <script>
    
</body>
</html>