package com.te.Autowiringproj.ByConstructor;

public class Screen {
	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Screen [name=" + name + "]";
	}
	
}
