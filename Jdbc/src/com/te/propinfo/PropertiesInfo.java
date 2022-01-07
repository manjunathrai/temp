package com.te.propinfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class PropertiesInfo 
{
	public static void main(String[] args) {
		Connection connection=null;
		 Statement createStatement = null;
		try {
			FileReader fr=new FileReader("C:\\Users\\ManjunathRai\\Desktop\\MySqlCred.txt");
			Properties prop = new Properties();
			prop.load(fr);
			String sr = "jdbc:mysql://localhost:3306/jdbcdemo";
			 connection = DriverManager.getConnection(sr,prop);
			 createStatement= connection.createStatement();
			 createStatement.executeUpdate("insert into sweets values(1123,'halwa',25.26,3)");
			 
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(createStatement!=null)
			{
				try {
					createStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
