package com.te.Trans;
import java.sql.*;
public class Demo 
{
	public static void main(String[] args) {
		Connection con= null;
	    Statement stmt = null;
	    Savepoint setp=null;
	    try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","admin");
			stmt = con.createStatement();
			con.setAutoCommit(false);
			stmt.execute("Insert into trans values(1,'Unlocking by finger print')");
			stmt.execute("Insert into trans values(2,'Entering the pin')");
			stmt.execute("Insert into trans values(3,'Check balance')");
			System.out.println("Your balance is 100000");
			setp=con.setSavepoint();
			stmt.execute("Insert into trans values (4,'debiting the amount')");	
			stmt.execute("Insert into trans values(5,'transfer through network')");	
			stmt.execute("Insert into trans values(6,'credited to amount')");
			System.out.println("Transaction completed !");
			con.commit();
		} catch (SQLException e) {
			try {
				con.rollback(setp);
				con.commit();
			} catch (SQLException e1) {
			}
			System.out.println("Transaction failed!");
		}
	    
	}

}
