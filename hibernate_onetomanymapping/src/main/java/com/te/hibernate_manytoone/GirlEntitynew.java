package com.te.hibernate_manytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class GirlEntitynew {
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy = "g")
	private List<BoyEntitynew> b;
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
	
	public List<BoyEntitynew> getB() {
		return b;
	}
	public void setB(List<BoyEntitynew> b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Girl [id=" + id + ", name=" + name + ", b=" + b + "]";
	}

}
