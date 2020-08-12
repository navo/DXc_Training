package com.CRUDOperations.CrudOperations;


	import java.util.ArrayList;
	import java.util.List;

	import org.springframework.stereotype.Component;

	@Component
	public class ProductRepo {

		 List<Product> products=new ArrayList<Product>();
		public List<Product> getProducts() {
			return products;
		}

		public void setProducts(List<Product> products) {
			this.products = products;
		}
		public void addProduct(Product product) {
			this.products.add(product);
		}
		public void delProduct(int index) {//write your own logic here
			this.products.remove(index);
		}
		
	}



