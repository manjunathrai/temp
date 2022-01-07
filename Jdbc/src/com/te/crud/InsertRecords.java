package com.te.crud;

import java.sql.*;
import java.util.Scanner;

public class InsertRecords 
{
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt=null;
		Scanner sc = new Scanner(System.in);
		
		try {
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","admin");
			pstmt = con.prepareStatement("insert into sweets values(?,?,?,?)");
			System.out.println("Enter the id of the sweets");
			int id = sc.nextInt();
			System.out.println("enter the name of the sweets");
			sc.next();
			String name= sc.nextLine();
			System.out.println(name);
			System.out.println("Enter the price");
			double price = sc.nextDouble();
			System.out.println("Enter the Quantity");
			int Quantity = sc.nextInt();
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, price);
			pstmt.setInt(4, Quantity);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
