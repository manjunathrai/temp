package com.te.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class CreateTable 
{

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
			try {
			Driver dr = new Driver();
			DriverManager.registerDriver(dr);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=admin");
			stmt=con.createStatement();
			stmt.execute("create table sweets (Id int,Name varchar(40),Price long,Quantity)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	finally	
	
	{
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
