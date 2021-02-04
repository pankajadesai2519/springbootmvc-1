package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;
@RestController
@RequestMapping(path = "/categories")
public class CategoryController {
	 @Autowired
	 private CategoryService categoryService;
	 
	 @RequestMapping(method = RequestMethod.POST)
	    public ResponseEntity<?> createCategory(@RequestBody @Validated Category request) {
	        // Creating a new category in the application...
	        final Category category = categoryService.createCategory(request.getName());

	        return ResponseEntity.status(HttpStatus.CREATED).body(null);
	    }
	 
	 @RequestMapping(method = RequestMethod.GET)
	    public ResponseEntity<?> retrieveAllCategories() {
	        // Getting all categories in application...
	        final List<Category> categories = categoryService.getAllCategories();

	        return (ResponseEntity<?>) ResponseEntity.ok();
	    }
	
	
	
}
