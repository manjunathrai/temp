package com.te.Autowiringproj.ByConstructor;

public class Battery
{
	String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Battery [name=" + name + "]";
	}
	
	

}