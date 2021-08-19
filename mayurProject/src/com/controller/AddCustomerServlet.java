package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AddCustomerDao;
import com.model.AddCustomerModel;

public class AddCustomerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//model
		
		AddCustomerModel cm=new AddCustomerModel();
		cm.setCname(request.getParameter("cname"));
		cm.setEmail(request.getParameter("email"));
		cm.setAdd(request.getParameter("add"));
		cm.setPno(request.getParameter("pno"));
		cm.setPsw(request.getParameter("psw"));
		
		
		//Dao
		
		int status=AddCustomerDao.addCustomerDetails(cm);
		if(status==1)
		{
			out.println("Customer Regisytration Successfull!!");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		else
		{
			out.println("Please Try Again !!!");
			RequestDispatcher rd=request.getRequestDispatcher("AddCustomer.jsp");
			rd.include(request, response);
		}
		
		
		
		
	}

}
