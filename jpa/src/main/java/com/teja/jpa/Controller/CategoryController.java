package com.teja.jpa.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.teja.jpa.models.Category;
import com.teja.jpa.services.CategoryService;

@RestController
public class CategoryController {
	
@Autowired
private CategoryService categoryservice;

@GetMapping("/create")   
public  String  CreateCategory
(		@RequestParam int param1,
		@RequestParam String param2,
        @RequestParam String param3,
        @RequestParam String param4,
        @RequestParam String param5
)
{
	
	Category category=new Category(param1, param2, param3, param4,param5);	
	 categoryservice.createCategory(category);
	 
	 return "Category saved in the database";
}

@GetMapping("/findall")   

public List<Category> Fetchcategory()
{
	
	return categoryservice.fetchCategory();
}




}
