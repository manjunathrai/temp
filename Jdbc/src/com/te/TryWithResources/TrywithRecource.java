package com.te.TryWithResources;

import java.sql.*;

public class TrywithRecource 
{
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=admin");
				Statement stmt = con.createStatement();){
			boolean rs=stmt.execute("alter table sweets rename champa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
