package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.AddCustomerModel;

public class AddCustomerDao {

	public static int  addCustomerDetails(AddCustomerModel cm)
	{
		int status=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost/JSPM", "root", "sonali");
			PreparedStatement ps=con.prepareStatement
			("insert into CustomerDetails values(?,?,?,?,?,?)");
			ps.setString(1, null);
			ps.setString(2, cm.getCname());
			ps.setString(3, cm.getEmail());
			ps.setString(4, cm.getPsw());
			ps.setString(5,cm.getPno());
			ps.setString(6,cm.getAdd());
			
			status=ps.executeUpdate();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
	}

}
