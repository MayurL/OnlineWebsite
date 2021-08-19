package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerLoginDao;
import com.model.CustomerLoginModel;

public class CustomerLoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//reading data from view and setting  it to model object 
		CustomerLoginModel cl=new CustomerLoginModel();
		cl.setEmail(request.getParameter("email"));
		cl.setPsw(request.getParameter("psw"));
		
		//invoked Dao for verification of customer
		
		boolean status=CustomerLoginDao.customerVerification(cl);
		
		//According to result controller(servlet) is deciding next page 
		
		if(status)
		{
			//Session Tracking code
			HttpSession session=request.getSession();
			session.setAttribute("email", request.getParameter("email"));
			
			RequestDispatcher rd= request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println
	("Sorry UserName or Password Error!!!<br> Please try Again!!!!");
			RequestDispatcher rd= request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
			
			
		}
		
	}

}












