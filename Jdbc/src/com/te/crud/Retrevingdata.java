package com.te.crud;

import java.sql.*;

public class Retrevingdata 
{
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","admin");
			stmt = con.createStatement();
			rs=stmt.executeQuery("Select * from sweets");
			while(rs.next())
			{
				System.out.print(rs.getString(1)+",");
				System.out.print(rs.getString(2)+",");
				System.out.print(rs.getString(3)+",");
				System.out.println(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally	
		{
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
			
		
		
	}

}
