package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Productdetails {
	
	
	PreparedStatement ps=null;
	Connection con = null;
	
	public void insertProductdtails() throws SQLException {
		
		try {
			Product product = new Product();
			con=product.getConnection();
			ps = con.prepareStatement("select*from product");
			
		
		ResultSet set = ps.executeQuery();
		while(set.next()) {
			System.out.println("productid= "+set.getString(1));
			System.out.println("productname ="+set.getString(2));
			System.out.println("productdescription ="+set.getString(3));
			System.out.println("productprice ="+set.getInt(4));
			System.out.println("productquantity ="+set.getString(5));
			
		}
		set.close();
				
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ps.close();
			con.close();
			
		}
	}

	}	


