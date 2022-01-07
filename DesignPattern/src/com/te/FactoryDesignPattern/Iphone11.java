package com.te.FactoryDesignPattern;

public class Iphone11 implements Mobile {

	@Override
	public void call() {
		System.out.println("Calling from  Iphone");
	}

	@Override
	public void message() {
		System.out.println("Messaging from  Iphone");		
	}

	@Override
	public void image() {
		System.out.println("clicking image from Iphone");		
	}

	

}
