package com.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class Product {
	static Connection con = null;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_commers", "root", "mypass@28");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}

}
