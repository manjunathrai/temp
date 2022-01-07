package com.te.hibernate_onetoonebidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.te.hibernate_onetooneunidirection.Boy;
@Entity(name = "NewGirl")
public class Girlnew {
	@Id
	private int gid;
	private String name;
	@OneToOne
	private Boynew b;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boynew getB() {
		return b;
	}
	public void setB(Boynew b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Girl [gid=" + gid + ", name=" + name + ", b=" + b + "]";
	}

}
