<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddProductServlet" method="post">

	<table>
		<tr>
			<td>Product Name</td>
			<td><input type="text" name="pname"></td>
			
		</tr>
		<tr>
			<td>Brand Name</td>
			<td><input type="text" name="bname">
		</tr>
		<tr>
			<td>Made In</td>
			<td><input type="text" name="madeIn">
		</td>
		<tr>
			<td>Price</td>
			<td><input type="number" name="price"></td>
		</tr>
		<tr>
			<td>Available</td>
			<td><input type="number" name="count"></td>
		</tr>
		
		<tr>
			<td><input type="submit" value="AddProduct"></td>
			<td><input type="reset" value="Cancel"></td>
		</tr>
	</table>
</form>

</body>
</html>






