package com.dxc.beans;

public class Product {
private int id;
private String name;
private float price;
private String discription;

public Product(int id, String name, float price, String discription) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.discription = discription;
}

public Product() {}

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

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public String getDiscription() {
	return discription;
}

public void setDiscription(String discription) {
	this.discription = discription;
}


}
