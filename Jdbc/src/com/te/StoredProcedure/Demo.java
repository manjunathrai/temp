package com.te.StoredProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/jdbcdemo?user=root&password=admin";
		
		try {
			con = DriverManager.getConnection(url);
			cstmt = con.prepareCall("call MinSweet()");
			rs=cstmt.executeQuery();
			if(rs.next()) {
				String name= rs.getString(1);
				int qunt = rs.getInt(2);
				System.out.println(name+" | "+qunt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
