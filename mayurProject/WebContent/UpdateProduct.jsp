<%@page import="com.dao.UpdateProductDao"%>
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
	AddProductModel pm=new AddProductModel();
	pm.setId(Integer.parseInt(request.getParameter("id")));
	pm.setPname(request.getParameter("pname"));
	pm.setBname(request.getParameter("bname"));
	pm.setMadeIn(request.getParameter("madeIn"));
	pm.setPrice(Integer.parseInt(request.getParameter("price")));
	pm.setCount(Integer.parseInt(request.getParameter("count")));
	
	int status=UpdateProductDao.updateProduct(pm);
	if(status>0)
	{
%>
	<jsp:forward page="ProductSearch.jsp">
		<jsp:param value="<%=pm.getPname() %>" name="pname"/>
	</jsp:forward>
<%
	}
	else
	{
%>
		<jsp:forward page="ProductSearch.jsp">
			<jsp:param value="<%=pm.getPname() %>" name="pname"/>
		</jsp:forward>
<%
		
	}
	
%>

</body>
</html>