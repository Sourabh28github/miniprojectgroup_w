package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserRegistration {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username>>");
		String username = sc.next();
		System.out.println("Enter mobilenumber");
		String mobilenumber = sc.next();
		System.out.println("Enter email address");
		String email=sc.next();
		System.out.println("Enter city");
		String city= sc.next();
		try{
			Product product = new Product();
		Connection con = product.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into user(username,mobilenumber,email,city)values(?,?,?,?)");
		ps.setString(1, username);
		ps.setString(2, mobilenumber);
		ps.setString(3, email);
		ps.setString(4, city);
		
		int register=ps.executeUpdate();
		System.out.println("User registration completed successfully"+register);
		con.close();
		ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		Productdetails pd = new Productdetails();
		pd.insertProductdtails();
		System.out.println("enter product number");
		int i=sc.nextInt();
		int a=0;
		int j;
		for(a=i;a>0;a--) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter productid>>");
			int productid=sc.nextInt();
			System.out.println("Enter quantity you want");
			int quantity=sc.nextInt();
			j=quantity;
		
			
			try {
			
					Product product = new Product();
					Connection con = product.getConnection();
					if(productid==1) {
					
					PreparedStatement ps = con.prepareStatement("select price from product where productid='1'");
					PreparedStatement ps1 = con.prepareStatement("select productname from product where productid='1'");
					PreparedStatement ps2 = con.prepareStatement("insert into shoppingcart(username,productid,productname,quantity,price,city)"
							+ "values(?,?,?,?,?,?)");
					ps2.setString(1, username);
					ps2.setString(2, "1");
					ps2.setString(3, "SAMSUNG Galaxy S22plus 5g");
					ps2.setInt(4, j);
					ps2.setString(5, "69999");
					ps2.setString(6, city);
					int b=ps2.executeUpdate();
					
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						 System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
						
					}while(rs1.next()) {
						
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					//rs2.close();
					con.close();
					rs.close();
					ps.close();
					
				}else if(productid==2) {
					PreparedStatement ps = con.prepareStatement("select price from product where productid='2'");
					PreparedStatement ps1 = con.prepareStatement("select productname from product where productid='2'");
					PreparedStatement ps2 = con.prepareStatement("insert into shoppingcart(username,productid,productname,quantity,price,city)"
							+ "values(?,?,?,?,?,?)");
					ps2.setString(1, username);
					ps2.setString(2, "2");
					ps2.setString(3, "Noise icon Buzz BT calling smartwatch");
					ps2.setInt(4, j);
					ps2.setString(5, "1899");
					ps2.setString(6, city);
					int b=ps2.executeUpdate();
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					while(rs.next()) {
						
						System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
					}while(rs1.next()) {
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					con.close();
					rs.close();
					ps.close();
					
				}else if(productid==3) {
					PreparedStatement ps = con.prepareStatement("select price from product where productid='3'");
					PreparedStatement ps1 = con.prepareStatement("select productname from product where productid='3'");
					PreparedStatement ps2 = con.prepareStatement("insert into shoppingcart(username,productid,productname,quantity,price,city)"
							+ "values(?,?,?,?,?,?)");
					ps2.setString(1, username);
					ps2.setString(2, "3");
					ps2.setString(3, "Asian shoes");
					ps2.setInt(4, j);
					ps2.setString(5, "630");
					ps2.setString(6, city);
					int b=ps2.executeUpdate();
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					while(rs.next()) {
						
						System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
					}while(rs1.next()) {
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					con.close();
					rs.close();
					ps.close();
				}else if (productid==4) {
					PreparedStatement ps = con.prepareStatement("select price from product where productid='4'");
					PreparedStatement ps1 = con.prepareStatement("select productname from product where productid='4'");
					PreparedStatement ps2 = con.prepareStatement("insert into shoppingcart(username,productid,productname,quantity,price,city)"
							+ "values(?,?,?,?,?,?)");
					ps2.setString(1, username);
					ps2.setString(2, "4");
					ps2.setString(3, "U.S.POLO ASSN jeans");
					ps2.setInt(4, j);
					ps2.setString(5, "789");
					ps2.setString(6, city);
					int b=ps2.executeUpdate();
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
					}while(rs1.next()) {
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					con.close();
					rs.close();
					ps.close();
				}else if (productid==5) {
					PreparedStatement ps = con.prepareStatement("select price from product where productid='5'");
					PreparedStatement ps1 = con.prepareStatement("select productname from product where productid='5'");
					PreparedStatement ps2 = con.prepareStatement("insert into shoppingcart(username,productid,productname,quantity,price,city)"
							+ "values(?,?,?,?,?,?)");
					ps2.setString(1, username);
					ps2.setString(2, "5");
					ps2.setString(3, "wildcraft Bag");
					ps2.setInt(4, j);
					ps2.setString(5, "750");
					ps2.setString(6, city);
					int b=ps2.executeUpdate();
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
					}while(rs1.next()) {
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					con.close();
					rs.close();
					ps.close();
				}else if (productid==6) {
					PreparedStatement ps = con.prepareStatement("select price from product where productid='6'");
					PreparedStatement ps1 = con.prepareStatement("select productname from product where productid='6'");
					PreparedStatement ps2 = con.prepareStatement("insert into shoppingcart(username,productid,productname,quantity,price,city)"
							+ "values(?,?,?,?,?,?)");
					ps2.setString(1, username);
					ps2.setString(2, "6");
					ps2.setString(3, "Siril saree");
					ps2.setInt(4, j);
					ps2.setString(5, "550");
					ps2.setString(6, city);
					int b=ps2.executeUpdate();
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
					}while(rs1.next()) {
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					con.close();
					rs.close();
					ps.close();
				}else if(productid==7) {
					PreparedStatement ps = con.prepareStatement("select price from product where productid='7'");
					PreparedStatement ps1 = con.prepareStatement("select productname from product where productid='7'");
					PreparedStatement ps2 = con.prepareStatement("insert into shoppingcart(username,productid,productname,quantity,price,city)"
							+ "values(?,?,?,?,?,?)");
					ps2.setString(1, username);
					ps2.setString(2, "7");
					ps2.setString(3, "Wallet");
					ps2.setInt(4, j);
					ps2.setString(5, "350");
					ps2.setString(6, city);
					int b=ps2.executeUpdate();
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					
					while(rs.next()) {
						
						System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
					}while(rs1.next()) {
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					con.close();
					rs.close();
					ps.close();
				}else if(productid==8) {
					PreparedStatement ps = con.prepareStatement("select price from product where productid='8'");
					PreparedStatement ps1 = con.prepareStatement("select productname from product where productid='8'");
					PreparedStatement ps2 = con.prepareStatement("insert into shoppingcart(username,productid,productname,quantity,price,city)"
							+ "values(?,?,?,?,?,?)");
					ps2.setString(1, username);
					ps2.setString(2, "8");
					ps2.setString(3, "T-shirt");
					ps2.setInt(4, j);
					ps2.setString(5, "450");
					ps2.setString(6, city);
					int b=ps2.executeUpdate();
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					while(rs.next()) {
						
						System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
					}while(rs1.next()) {
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					con.close();
					rs.close();
					ps.close();
				}else if(productid==9) {
					PreparedStatement ps = con.prepareStatement("select price from product where productid='9'");
					PreparedStatement ps1 = con.prepareStatement("select productname from product where productid='9'");
					PreparedStatement ps2 = con.prepareStatement("insert into shoppingcart(username,productid,productname,quantity,price,city)"
							+ "values(?,?,?,?,?,?)");
					ps2.setString(1, username);
					ps2.setString(2, "9");
					ps2.setString(3, "Pen");
					ps2.setInt(4, j);
					ps2.setString(5, "20");
					ps2.setString(6, city);
					int b=ps2.executeUpdate();
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					while(rs.next()) {
						System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
					}while(rs1.next()) {
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					con.close();
					rs.close();
					ps.close();
				}else {
					PreparedStatement ps = con.prepareStatement("select price from product where productid='10'");
					PreparedStatement ps1 = con.prepareStatement("select productname from product where productid='9'");
					PreparedStatement ps2 = con.prepareStatement("insert into shoppingcart(username,productid,productname,quantity,price,city)"
							+ "values(?,?,?,?,?,?)");
					ps2.setString(1, username);
					ps2.setString(2, "10");
					ps2.setString(3, "NIVIEA facewash");
					ps2.setInt(4, j);
					ps2.setString(5, "114");
					ps2.setString(6, city);
					int b=ps2.executeUpdate();
					ResultSet rs=ps.executeQuery();
					ResultSet rs1=ps1.executeQuery();
					while(rs.next()) {
						System.out.println("Total price for the products you buy="+rs.getInt(1)*j);
					}while(rs1.next()) {
						System.out.println("Productname you are going to buy="+rs1.getString(1));
					}
					System.out.println("insertion of product into cart completed "+b);
					con.close();
					rs.close();
					ps.close();
				}		
			}catch(Exception e) {
				e.printStackTrace();
			}
			
	    }
		
		Adminlogin login = new Adminlogin();
		login.adminlogin();
			
		}
		
	}


