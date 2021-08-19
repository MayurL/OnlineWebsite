<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddCustomerServlet" method="post">

	<table>
		<tr>
			<td>Customer Name</td>
			<td><input type="text" name="cname"></td>
			
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="email" name="email">
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="psw">
		</td>
		<tr>
			<td>Address</td>
			<td><textarea rows="6" cols="25" name="add"></textarea></td>
		</tr>
		<tr>
			<td>Contact Number</td>
			<td><input type="text" name="pno"></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="Register"></td>
			<td><input type="reset" value="Cancel"></td>
		</tr>
	</table>
</form>
</body>
</html>