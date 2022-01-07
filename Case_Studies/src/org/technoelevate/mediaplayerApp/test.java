package org.technoelevate.mediaplayerApp;

import java.util.Scanner;

public class test 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		char c= (char)10;
		String r=""+c;
		System.out.println(r);
		String s="";
		String st="";
		while(!st.contains(r))
		{
			st=sc.next();
			s=s+st;
			s=s+" ";
			
		}
		System.out.println(s);
	}

}
