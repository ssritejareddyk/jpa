package com.teja.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teja.jpa.Repository.CategoryRepo;
import com.teja.jpa.models.Category;

import jakarta.transaction.Transactional;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepo categoryrepo;
	
	@Transactional
	public void createCategory(Category category) {
		try {
			categoryrepo.save(category);
		} catch (Exception e) {
			// Handle the exception, log, or perform necessary actions
			e.printStackTrace(); // For demonstration purposes - should be handled appropriately
			// You can also throw a custom exception or handle it according to your use case
			throw new RuntimeException("Failed to create a category: " + e.getMessage());
		}
	}
	
	public void UpdateCategory()
	{
		
	}
	public List<Category> fetchCategory()
	{
		return categoryrepo.findAll();
	}
	public void DeleteCategory()
	{
		
	}
	

}
