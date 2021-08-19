package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AddProductDao;
import com.model.AddProductModel;

public class AddProductServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String pn=request.getParameter("pname");
		String bn=request.getParameter("bname");
		String mi=request.getParameter("madeIn");
		int c=Integer.parseInt(request.getParameter("count"));
		int p=Integer.parseInt(request.getParameter("price"));
		
		//model 
		
		AddProductModel pm=new AddProductModel();
		pm.setPname(pn);
		pm.setBname(bn);
		pm.setMadeIn(mi);
		pm.setPrice(p);
		pm.setCount(c);
		
		// DAO
		
		int status=AddProductDao.addProductDetails(pm);
		
		//next view 
		if(status==1)
		{
			out.println("Product Register Successfully!!!!");
			
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		else
		{
			out.println("Please Try Again!!!");
			
			RequestDispatcher rd=request.getRequestDispatcher("AddProduct.jsp");
			rd.include(request, response);
		}
		
		
	}

}
