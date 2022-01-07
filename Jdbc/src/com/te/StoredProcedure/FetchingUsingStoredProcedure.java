package com.te.StoredProcedure;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

public class FetchingUsingStoredProcedure 
{
	public static void main(String[] args) {
		Connection con=null;
		CallableStatement stmt=null;
		ResultSet rs=null;
		String url= "jdbc:mysql://localhost:3306/jdbcdemo";
		try {
			FileReader fr=new FileReader("C:\\\\Users\\\\ManjunathRai\\\\Desktop\\\\MySqlCred.txt");
			Properties prop=new Properties();
			prop.load(fr);
			con=DriverManager.getConnection(url,prop);
			stmt = con.prepareCall("call MinSweet()");
			stmt.execute();
		} catch ( IOException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
