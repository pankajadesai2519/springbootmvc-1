package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	    @Autowired
	    private ProductRepository productRepository;
	    
	    @Override
	    public Product getAllProducts(Category category) {
	        return productRepository.findByAssociatedWithCategory(category.getId());
	    }

	    
	    @Override
	    public Product createProduct(String name, double price) { 
	        Product product = new Product();
	        product.setName(name);
	        product.setPrice(price);
	        return productRepository.save(product);
	    }

	    @Override
	    public void updateProduct(Product product, String name, double price) {
	        product.setName(name);
	        product.setPrice(price);
	        productRepository.save(product);
	    }

}
