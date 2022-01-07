package com.te.FactoryDesignPattern;

public class Redmi implements Mobile {

	@Override
	public void call() {
		System.out.println("Calling from redmi phone");
	}

	@Override
	public void message() {
		System.out.println("Messaging from redmi phone");		
	}

	@Override
	public void image() {
		System.out.println("clicking image from redmi phone");		
	}

	

}
