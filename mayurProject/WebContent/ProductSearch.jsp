<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,com.model.*,com.dao.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ProductSearch.jsp">
	<table align="center">
		<tr>
			<td>Product Name</td>
			<td><input type="text" name="pname"></td>
			<td><input type="submit" value="Search"></td>
		</tr>
	</table>
	
</form>
<br>
<br>
<div align="center" >
<!--<table align="center"  style="padding: 30 px" border="3">
	 <tr><th>ID</th>
		<th>ProductName</th>
		<th>Brand Name</th>
		<th>Made IN </th>
		<th> Price </th>
		<th>Product Available Count</th>
	</tr> -->
	
<%
	if(request.getParameter("pname")!=null)
	{
		String pn=request.getParameter("pname");
		//out.println("Product Name :"+pn);
		
		List<AddProductModel> l=ProductSearchDao.searchProduct(pn);
		for(AddProductModel pm:l)
		{
%>
		<div align="left" style="border: solid;">
			Product Name:<%=pm.getPname() %><br>
			Brand Name:<%=pm.getBname() %><br>
			Made In :<%=pm.getMadeIn() %><br>
			Price:<%=pm.getPrice() %><br>
			<br>
			<br>
			
			<a href="DeleteProduct.jsp?pid=<%=pm.getId() %>&pname=<%=pm.getPname() %>" >Delete</a>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
			<a href="EditProduct.jsp?pid=<%=pm.getId()%>&pname=<%=pm.getPname()%>">Edit</a>
			<br>
			<br>
			
		
		</div>
		<%-- <tr>
			<td><%=pm.getId() %></td>
			<td><%=pm.getPname() %></td>
			<td><%=pm.getBname() %></td>
			<td><%=pm.getMadeIn() %></td>
			<td><%=pm.getPrice() %></td>
			<td><%=pm.getCount() %></td>
		</tr> --%>

<%
			
		}
	}
%>
<!-- </table>
 -->
 </div>

</body>
</html>







