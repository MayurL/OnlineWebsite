<%@page import="com.dao.EditProductDao"%>
<%@page import="com.model.AddProductModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int pid=Integer.parseInt(request.getParameter("pid"));
	String pname=request.getParameter("pname");
	
	AddProductModel pm=EditProductDao.fetchProductDetails(pid);
	
%>
<form action="UpdateProduct.jsp">
<table>

<tr><td>ID</td>
	<td><input type="number" value="<%=pm.getId() %>" name="id" readonly="readonly"></td>
</tr> 
<tr><td>Product Name</td>
		<td><input type="text" value="<%=pm.getPname() %>" name="pname"></td>
</tr> 
<tr><td>Product Brand Name</td>
		<td><input type="text" value="<%=pm.getBname() %>" name="bname"></td>
</tr> 
<tr><td>Made In</td>
		<td><input type="text" value="<%=pm.getMadeIn() %>" name="madeIn"></td>
</tr> 
<tr><td>Price</td>
		<td><input type="number" value="<%=pm.getPrice() %>" name="price"></td>
</tr>
<tr><td>Product Available</td>
		<td><input type="number" value="<%=pm.getCount() %>" name="count"></td>
</tr>

<tr><td><input type="submit" value="update"></td>
		<td><input type="reset" value="cancel" ></td>
</tr> 


</table>
</form>


</body>
</html>