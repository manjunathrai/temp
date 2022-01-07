package com.te.First_prog;

public class Car {
	Garage e;
	String name;

	public Car(Garage e, String name) {
		super();
		this.e = e;
		this.name = name;
	}

	public void move() {
		e.start();
		System.out.println(name + " Car is moving");
	}
}
