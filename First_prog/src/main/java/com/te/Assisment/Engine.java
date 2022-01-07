package com.te.Assisment;

public class Engine {
	String name;
	double capacity;

	public Engine(String name, double capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}

	public void start() {
		System.out.println(name + " Engine is started with capacity = " + capacity);

	}

}
