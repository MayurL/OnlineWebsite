package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.AddProductModel;

public class ProductSearchDao 
{
	public static List<AddProductModel> searchProduct(String pn)
	{
		List<AddProductModel> l=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
		("jdbc:mysql://localhost/JSPM", "root", "sonali");
			PreparedStatement ps=con.prepareStatement
			("select * from ProductDetails where productName=?");
			ps.setString(1,pn);
			ResultSet rs=ps.executeQuery();
			l=new ArrayList<AddProductModel>();
			while(rs.next())
			{
				AddProductModel pm=new AddProductModel();
				pm.setId(rs.getInt("id"));
				pm.setPname(rs.getString("productName"));
				pm.setBname(rs.getString("productBrandName"));
				pm.setMadeIn(rs.getString("MadeIn"));
				pm.setCount(rs.getInt("productCount"));
				pm.setPrice(rs.getInt("Price"));
				
				l.add(pm);
			}
			
			
		}
		catch (Exception e) {
			// TODO: han1dle exception
			System.out.println(e);
		}
		
		return l;
	}

}
