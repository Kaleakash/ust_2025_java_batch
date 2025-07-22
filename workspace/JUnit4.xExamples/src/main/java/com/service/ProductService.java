package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Product;

public class ProductService {

	List<Product> listOfProduct = new ArrayList<Product>();
	
	public String addProduct(Product product) {
		// logic to add the product in array or collection class. 
		// product id must be unique 
		
		return "Product added";	// product is must unique 
	}
	public Product findProduct(int pid) {
		// search the product details from collection using iterator
		
		return null;		// return product object if present else return null;
	}
}
