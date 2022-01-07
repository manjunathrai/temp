package com.te.Autowriningproj.ByName;

public class NewLaptop {
	NewBattery b;
	NewScreen s;
	HardDisk hd1;
	HardDisk hd2;

	public void setB(NewBattery b) {
		this.b = b;
	}

	public void setS(NewScreen s) {
		this.s = s;
	}

	public void setHd1(HardDisk hd1) {
		this.hd1 = hd1;
	}

	public void setHd2(HardDisk hd2) {
		this.hd2 = hd2;
	}

	@Override
	public String toString() {
		return "NewLaptop [b=" + b + ", s=" + s + ", hd1=" + hd1 + ", hd2=" + hd2 + "]";
	}

}
