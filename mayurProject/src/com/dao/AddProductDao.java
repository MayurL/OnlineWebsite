package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.AddProductModel;

public class AddProductDao 
{
	public static int  addProductDetails(AddProductModel pm)
	{
		int status=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost/JSPM", "root", "sonali");
			PreparedStatement ps=con.prepareStatement
			("insert into ProductDetails values(?,?,?,?,?,?)");
			ps.setString(1, null);
			ps.setString(2, pm.getPname());
			ps.setString(3, pm.getBname());
			ps.setString(4, pm.getMadeIn());
			ps.setInt(5,pm.getPrice());
			ps.setInt(6, pm.getCount());
			
			status=ps.executeUpdate();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
	}

}
