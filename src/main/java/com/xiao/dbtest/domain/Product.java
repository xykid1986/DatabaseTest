package com.xiao.dbtest.domain;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Product {

	@Id
	private String id;
	private String name;
	private int price;
	public String getId() {
		return id;
	}
	
	public Product(){
		
	}
	
	public Product(String name, int price){
		this.name=name;
		this.price=price;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
