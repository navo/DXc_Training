package com.dxc.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.dxc.beans.Product;

@Component
public class ProductRepo {
	 private int counter=1;
	 List<Product> products=new ArrayList<Product>();

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public void addProduct(Product product) {
		int ID = counter;
		String name =product.getName();
		float price = product.getPrice();
		String description = product.getDiscription();
		Product product1 = new Product(ID,name,price,description);
		this.products.add(product1);
		counter++;
	}
	public void delProduct(int id) {//write your own logic here
		
		for(Product ob:products)
		{
			if(ob.getId()==id)
			{
				products.remove(ob);
			}
		}
	}
	
}
