package com.example.demo.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Table(name="app_product")
public class Product extends AbstractEntity{
	
	    @Column(name = "name", nullable = false)
	    private String name;

	    @ManyToMany
	    @JoinTable(name = "app_product_category", joinColumns = @JoinColumn(name = "productid"), inverseJoinColumns = @JoinColumn(name = "categoryid"))
	    private Set<Category> categories;

	    @Column(name = "price", nullable = false)
	    private double price;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Set<Category> getCategories() {
	        return categories;
	    }

	    public void setCategories(Set<Category> categories) {
	        this.categories = categories;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

}
