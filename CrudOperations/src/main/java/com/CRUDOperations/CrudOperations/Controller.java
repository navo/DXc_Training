package com.CRUDOperations.CrudOperations;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	ProductRepo productRepo;
	Product product = null;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String display() {
		return "Crud using Rest API";
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)

	public String addProduct(@RequestBody Product product) {
		this.product = product;
		productRepo.addProduct(product);
		return "The product is added";
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public List<Product> viewProduct() {
		return productRepo.getProducts();
	}

	@RequestMapping(value = "/product/{id1}", method = RequestMethod.DELETE)
	public String delProduct(@PathVariable("") String id1) {
		int id = Integer.parseInt(id1);

		for (Product product : productRepo.getProducts()) {
			if (id == product.getId()) {
				try {
				productRepo.getProducts().remove(product);
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}

		/*
		 * Iterator<Product> ite = productRepo.products.iterator(); while
		 * (ite.hasNext()) { Product product = ite.next(); if (product.getId() == id) {
		 * productRepo.getProducts().remove(product); } }
		 */

		return "Product has been deleted";
	}

}
