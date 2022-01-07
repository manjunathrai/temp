package com.te.StoredProcedure;
import java.sql.*;
import java.util.Scanner;
public class StoredProcedureCall
{
	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cstmt = null;
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		try {
			con =DriverManager.getConnection(url,"root","admin");
			cstmt = con.prepareCall("call put(?,?,?,?)");
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("Enter the id");
				int id = sc.nextInt();
				if(id==0)break;
			System.out.println("Enter the sweets name");
			String name = sc.next();
			System.out.println("Enter the price of the sweets");
			double price = sc.nextDouble();
			System.out.println("Enter the quantity");
			int kg = sc.nextInt();
			cstmt.setInt(1, id);
			cstmt.setString(2, name);
			cstmt.setDouble(3, price);
			cstmt.setInt(4, kg);
			cstmt.execute();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
