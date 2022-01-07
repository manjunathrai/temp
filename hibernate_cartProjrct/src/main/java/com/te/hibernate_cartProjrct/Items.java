package com.te.hibernate_cartProjrct;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Items
{
	@Id
	private int id;
	@Column(nullable = false)
	private String itemName;
	private int price;
	private int quantity;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@ManyToOne
	private Cart c;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Cart getC() {
		return c;
	}
	public void setC(Cart c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + ", c=" + c
				+ "]";
	}
	

}
