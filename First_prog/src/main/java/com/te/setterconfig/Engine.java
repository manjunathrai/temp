package com.te.setterconfig;

public class Engine {
	String name;
	double capacity;

	public void setName(String name) {
		this.name = name;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public void start() {
		System.out.println(name+ " engine with capacity = "+capacity);
		
	}

}
