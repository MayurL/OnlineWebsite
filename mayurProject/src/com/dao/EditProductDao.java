package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.AddProductModel;

public class EditProductDao 
{
	public static AddProductModel fetchProductDetails(int pid)
	{
		AddProductModel pm=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost/JSPM", "root", "sonali");
			
			PreparedStatement ps=con.prepareStatement
			("select * from ProductDetails where id=?");
			ps.setInt(1, pid);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				pm=new AddProductModel();
				pm.setId(rs.getInt("id"));
				pm.setPname(rs.getString("productName"));
				pm.setBname(rs.getString("productBrandName"));
				pm.setMadeIn(rs.getString("MadeIn"));
				pm.setPrice(rs.getInt("Price"));
				pm.setCount(rs.getInt("productCount"));
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return pm;
	}

}
