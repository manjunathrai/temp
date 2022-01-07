package com.te.FactoryDesignPattern;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args)
	{
		MobileHelperClass mobile = new MobileHelperClass();
		Scanner sc  = new Scanner(System.in);
		System.out.println(" enter the phone u want to buy");
		String s = sc.next();
		mobile.getMobile(s);
	}

}
