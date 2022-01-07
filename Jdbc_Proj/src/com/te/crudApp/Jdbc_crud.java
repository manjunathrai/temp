package com.te.crudApp;

import java.sql.*;
import java.util.Scanner;
public class Jdbc_crud 
{
	static Connection con;
	static PreparedStatement pstmt = null;
	static ResultSet rs=null;
	static void add()
	{
		Scanner sc = new Scanner(System.in);
		String sql1="insert into songlist (Song_name) values (?)";
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Playlist","root","admin");
			 pstmt= con.prepareStatement(sql1);
			 System.out.println("Enter the song u want to add");
			  String song=sc.nextLine();
			  
			 pstmt.setString(1,song);
			 pstmt.executeUpdate();
			 System.out.println(song+" added Successfully");
			 display();
			 System.out.println("===============================");
			 sc.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finalexit();
	}
	static void delete()
	{
		Scanner sc = new Scanner(System.in);
		String sql2="delete from songlist where Song_name=?";
		try {
			display();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Playlist","root","admin");
			 pstmt= con.prepareStatement(sql2);
		    System.out.println("Enter the song u want to delete");
		    String song=sc.nextLine();
		    sc.close();
		    pstmt.setString(1,song);
			 int res=pstmt.executeUpdate();
			 if(res>0)
			 System.out.println(song+" deleted Successfully");
			 else
				 System.out.println("No such song found");
			 display();
			 System.out.println("===============================");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finalexit();
	}
	static void update()
	{
		Scanner sc = new Scanner(System.in);
		String sql3 = "update songlist set song_name = ? where song_name =?";
		String song[]=new String[2];
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Playlist","root","admin");
			pstmt= con.prepareStatement(sql3);
		System.out.println("Enter the song name u want to change");
		 song[0]=sc.nextLine();
		 System.out.println("Enter the updated song Name");
		 song[1]=sc.nextLine();
		 sc.close();
		 pstmt.setString(1,song[1]);
			pstmt.setString(2, song[0]);
			pstmt.executeUpdate();
			System.out.println("Updated Successfully");
			display();
			System.out.println("===============================");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finalexit();
	}
	static void search()
	{
		Scanner sc = new Scanner(System.in);
		String sql4 = "Select * from songlist where song_name = ?";
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Playlist","root","admin");
		System.out.println("Enter the song u want to Search");
		String song=sc.nextLine();
		sc.close();
		pstmt= con.prepareStatement(sql4);
		pstmt.setString(1,song);
		rs=pstmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(2)+" is playing");
		}
		display();
		System.out.println("===============================");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	static void display()
	{
		String sql5 = "Select * from songlist";
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Playlist","root","admin");
			pstmt= con.prepareStatement(sql5);
			rs=pstmt.executeQuery();
			int i=1;
			while(rs.next())
			{
				System.out.print(i+" . ");
				System.out.println(rs.getString(2));
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	static void finalexit()
	{
		
			if(rs!=null)
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			if(pstmt!=null)
				try {
					pstmt.close();
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
	static void playSong()
	{
		display();
		Scanner sc = new Scanner(System.in);
		String sql6="select * from songlist where song_name = ?";
		try {
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Playlist","root","admin");
			 pstmt= con.prepareStatement(sql6);
			 System.out.println("Enter the song u want to listen");
			 String song = sc.nextLine();
			  sc.close();
			 pstmt.setString(1,song);
			 rs =pstmt.executeQuery();
			 if(rs.next())
			 System.out.println(song+" is playing");
			 else
				 System.out.println(song+" not found");
			 System.out.println("===============================");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finalexit();
	}
}
