package com.te.FactoryDesignPattern;

public class Samsung implements Mobile{

	@Override
	public void call() {
		System.out.println("Calling from samsung phone");
	}

	@Override
	public void message() {
		System.out.println("Messaging from samsung phone");		
	}

	@Override
	public void image() {
		System.out.println("clicking image from samsung phone");		
	}


}
