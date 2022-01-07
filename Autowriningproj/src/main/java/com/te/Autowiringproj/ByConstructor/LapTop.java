package com.te.Autowiringproj.ByConstructor;

public class LapTop 
{
	Battery b;
	Screen s;
	HardDisk hd1;
	HardDisk hd2;
	public LapTop(Battery b, Screen s, HardDisk hd1, HardDisk hd2) {
		super();
		this.b = b;
		this.s = s;
		this.hd1 = hd1;
		this.hd2 = hd2;
	}
	@Override
	public String toString() {
		return "LapTop [b=" + b + ", s=" + s + ", hd1=" + hd1 + ", hd2=" + hd2 + "]";
	}
	

}
