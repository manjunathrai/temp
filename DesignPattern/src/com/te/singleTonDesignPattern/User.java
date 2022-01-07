package com.te.singleTonDesignPattern;

public class User {
	public static void main(String[] args) {
//		Watsapp user1 = Watsapp.createObject();
//		Watsapp user2 = Watsapp.createObject();
//		System.out.println(user1);
//		System.out.println(user2);
		
		Watsapp user1 = Watsapp.w;
		Watsapp user2 = Watsapp.w;
		System.out.println(user1);
		System.out.println(user2);
		
	}

}
