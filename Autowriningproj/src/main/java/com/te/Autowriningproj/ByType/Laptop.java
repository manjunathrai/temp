package com.te.Autowriningproj.ByType;

public class Laptop {
	Battery b;
	Screen s;

	public void setB(Battery b) {
		this.b = b;
	}

	public void setS(Screen s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Laptop [b=" + b + ", s=" + s + "]";
	}

}
