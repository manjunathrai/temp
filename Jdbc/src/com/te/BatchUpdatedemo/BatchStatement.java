package com.te.BatchUpdatedemo;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BatchStatement 
{
	public static void main(String[] args) {
		Connection connection=null;
		 Statement createStatement = null;
		String url = "jdbc:mysql://localhost/jdbcdemo";
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\ManjunathRai\\Desktop\\MySqlCred.txt");
			Properties prop = new Properties();
			prop.load(fr);
			connection = DriverManager.getConnection(url,prop);
			createStatement=connection.createStatement();
			createStatement.execute("create table employees ( id int primary key,name varchar(40))");
			createStatement.addBatch("insert into employees values(101,'manju')");
			createStatement.addBatch("insert into employees values(102,'mohan')");
			createStatement.addBatch("insert into employees values(103,'mahesh')");
			createStatement.addBatch("insert into employees values(104,'murali')");
			createStatement.addBatch("update employees set name= 'manjunath' where id=101");
			int ar[]=createStatement.executeBatch();
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(ar[i]);
			}
			
		} catch ( IOException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
