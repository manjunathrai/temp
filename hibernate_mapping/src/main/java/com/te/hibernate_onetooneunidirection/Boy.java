package com.te.hibernate_onetooneunidirection;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Boy 
{
	@Id
	private int bid;
	private String name;
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
