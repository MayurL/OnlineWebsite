package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.CustomerLoginModel;

public class CustomerLoginDao 
{
	public static boolean customerVerification(CustomerLoginModel cl)
	{
		boolean status=false;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost/JSPM", "root", "sonali");
			
			PreparedStatement ps=con.prepareStatement
			("select * from CustomerDetails where email=? and password=?");
			
			ps.setString(1, cl.getEmail());
			ps.setString(2, cl.getPsw());
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

}











