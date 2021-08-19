package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.model.AddProductModel;

public class UpdateProductDao {
	
	public static int updateProduct(AddProductModel pm)
	{
		int status=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost/JSPM", "root", "sonali");
			PreparedStatement ps=con.prepareStatement
("update ProductDetails set productName=? , productBrandName=?, Price=?,productCount=?,MadeIn=? where id=?");
			ps.setString(1, pm.getPname());
			ps.setString(2, pm.getBname());
			ps.setInt(3, pm.getPrice());
			ps.setInt(4, pm.getCount());
			ps.setString(5, pm.getMadeIn());
			ps.setInt(6, pm.getId());
			
			status=ps.executeUpdate();
		}
		catch (Exception e) {
			// TODO: han1dle exception
			System.out.println(e);
		}
		
		return status;
	}
}
