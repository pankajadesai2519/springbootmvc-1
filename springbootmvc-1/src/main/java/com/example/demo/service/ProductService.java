package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Product;

public interface ProductService {
	 Product createProduct(String name,double price);
	 
	 Product getAllProducts(Category category);

	 void updateProduct(Product product, String name,double price);
	 
}
