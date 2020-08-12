package com.CRUDOperations.CrudOperations;

public class Product {
	private static int idCount = 1;
	private int id;
	private String name;
	private float price;
	private String description;

	public Product(String name, float price, String description) {
		super();
		this.id = idCount;
		idCount = idCount + 1;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Product() {

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
		this.id = idCount;
		idCount = idCount + 1;

	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDiscription(String description) {
		this.description = description;
	}

}
