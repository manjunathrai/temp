package com.te.setterconfig;

public class Car {
	String name;
	Engine e;

	public void setName(String name) {
		this.name = name;
	}

	public void setE(Engine e) {
		this.e = e;
	}
	public void move() {
		e.start();
		System.out.println(name+" is moving");
		
	}
}
