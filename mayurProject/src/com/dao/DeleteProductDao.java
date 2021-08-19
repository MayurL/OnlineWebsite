package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteProductDao 
{
	public static int deleteProduct(int pid)
	{
		int status=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost/JSPM","root","sonali");
			PreparedStatement ps=con.prepareStatement
			("delete from ProductDetails where id=?");
			ps.setInt(1, pid);
			
			status=ps.executeUpdate();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return status;
	}

}
