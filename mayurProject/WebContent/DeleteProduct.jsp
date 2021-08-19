<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.dao.*"%>
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
int status=DeleteProductDao.deleteProduct(pid);
if(status>0)
{
%>
	<jsp:forward page="ProductSearch.jsp">
		<jsp:param value="<%=pname %>" name="pname"/>
	</jsp:forward>
<%
	
}
else
{
%>
	<jsp:forward page="ProductSearch.jsp">
				<jsp:param value="<%=pname %>" name="pname"/>
	</jsp:forward>
<%	
}
%>
</body>
</html>