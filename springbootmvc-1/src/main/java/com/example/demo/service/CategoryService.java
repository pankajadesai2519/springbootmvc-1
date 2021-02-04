package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Category;

public interface CategoryService {
	Category createCategory(String name);
	
	void addChildCategory(Category child,Category parent);
	
    List<Category> getAllCategories();

	
}
