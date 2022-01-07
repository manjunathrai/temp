package com.te.hibernate_onetoonebidirection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity(name = "NewBoy")
public class Boynew {
	@Id
	private int bid;
	private String name;
	@OneToOne
	private Girlnew g;
	public Girlnew getG() {
		return g;
	}
	public void setG(Girlnew g) {
		this.g = g;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Boy [bid=" + bid + ", name=" + name + "]";
	}
}
