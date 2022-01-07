package com.te.hibernate_cartProjrct;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart 
{
	@Id
	private int id;
	@Column(nullable = false)
	private String CustomerName;
	private long TotalAmount;

	public long getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(long totalAmount) {
		TotalAmount = totalAmount;
	}

	@OneToMany (mappedBy = "c")
	private List<Items> items;

	@Override
	public String toString() {
		return "Cart [id=" + id + ", itemName=" + CustomerName + ", items=" + items + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return CustomerName;
	}

	public void setItemName(String itemName) {
		this.CustomerName = itemName;
	}

	
	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

}
