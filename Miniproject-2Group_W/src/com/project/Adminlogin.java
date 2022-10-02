package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Adminlogin  {
	//public static void main(String[] args) throws SQLException {
		
	
	public void adminlogin() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("If you are admin then enter password");
		String password = scanner.next();
		if(password.equals("ABCD")) {
			Product product = new Product();
			Connection con = product.getConnection();
			PreparedStatement ps = con.prepareStatement("select*from user");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Username="+rs.getString(1));
				System.out.println("email="+rs.getString(2));
				System.out.println("city="+rs.getString(3));
				System.out.println("mobilenumber="+rs.getString(4));
			}
			System.out.println("Enter product id:");
			int x=scanner.nextInt();
			
			Connection con1 = product.getConnection();
			PreparedStatement ps1 = con.prepareStatement("select quantity from product where productid=?;");
			 ps1.setInt(1, x);
			 ResultSet rs1 = ps1.executeQuery();
			while(rs1.next()) {
				System.out.println("product quantity= "+rs1.getInt(1));
			}rs1.close();
		}else {
			System.out.println("Invalid password");
		}
		}
		
	}


