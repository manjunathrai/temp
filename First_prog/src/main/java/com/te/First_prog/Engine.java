package com.te.First_prog;

public class Engine implements Garage {

	String name;
	double capacity;

	public Engine(String name, double capacity) {
		super();
		System.out.println("Engine constructor");
		this.name = name;
		this.capacity = capacity;
	}

	@Override
	public void start() {
		System.out.println(name + " Engine is Started and its capacity is = " + capacity);
	}

}
