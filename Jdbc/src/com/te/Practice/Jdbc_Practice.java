package com.te.Practice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc_Practice 
{
	public static void main(String[] args) {		
		Connection con=null;
		CallableStatement cstmt=null;
		try {
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","admin");
			cstmt=con.prepareCall("call put(110,'abc',500,5)");
			cstmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(cstmt!=null)
			{
				try {
					cstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
