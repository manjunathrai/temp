package com.te.hibernate_onetooneunidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Girl 
{
	@Id
	private int gid;
	private String name;
	@OneToOne
	private Boy b;
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
	public Boy getB() {
		return b;
	}
	public void setB(Boy b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Girl [gid=" + gid + ", name=" + name + ", b=" + b + "]";
	}
	
}
