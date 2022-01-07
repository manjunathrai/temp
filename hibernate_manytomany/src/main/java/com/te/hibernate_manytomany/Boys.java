package com.te.hibernate_manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Boys 
{
	@Id	
	private int id;
	private String name;
	private int balance ;
	@ManyToMany
	List<Girl> girls;
	
	@Override
	public String toString() {
		return "Boys [id=" + id + ", name=" + name + ", balance=" + balance + ", girls=" + girls + "]";
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public List<Girl> getGirls() {
		return girls;
	}

	public void setGirls(List<Girl> girls) {
		this.girls = girls;
	}
	

}
