package com.te.hibernate_manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class BoyEntitynew {
	@Id
	private int id;
	
	private String name;
	@ManyToOne
	private GirlEntitynew g;
	
	public GirlEntitynew getG() {
		return g;
	}
	public void setG(GirlEntitynew g) {
		this.g = g;
	}
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
	@Override
	public String toString() {
		return "BoyEntitynew [id=" + id + ", name=" + name + ", g=" + g + "]";
	}
	
}
