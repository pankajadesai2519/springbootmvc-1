package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
//Service layer
@Service
public class CategoryServiceImpl implements CategoryService{
	    @Autowired
	    private CategoryRepository categoryRepository;

	  @Override
	    public Category createCategory(String name) {
	        Category category = new Category();
	        category.setName(name);

	        return categoryRepository.save(category);
	    }
	    
	    @Override
	    public List<Category> getAllCategories() {
	        return categoryRepository.findAll();
	    }

	   
	    @Override
	    public void addChildCategory(Category category, Category parent) {
	        category.setParent(parent);
	        categoryRepository.save(category);
	    }

}
