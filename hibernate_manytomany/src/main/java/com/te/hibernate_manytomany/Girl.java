package com.te.hibernate_manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Girl {
	@Id
	private int id;
	private String name;
	@ManyToMany(mappedBy = "girls")
	List<Boys> boys;
	@Override
	public String toString() {
		return "Girl [id=" + id + ", name=" + name + ", boys=" + boys + "]";
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
	public List<Boys> getBoys() {
		return boys;
	}
	public void setBoys(List<Boys> boys) {
		this.boys = boys;
	}

}
