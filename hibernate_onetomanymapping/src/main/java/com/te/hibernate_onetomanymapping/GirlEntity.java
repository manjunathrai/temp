package com.te.hibernate_onetomanymapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//@Entity
public class GirlEntity
{
	@Id
	private int id;
	private String name;
	@OneToMany
	private List<BoyEntity> b;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<BoyEntity> getB() {
		return b;
	}
	public void setB(List<BoyEntity> b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Girl [id=" + id + ", name=" + name + ", b=" + b + "]";
	}
	
	
}
