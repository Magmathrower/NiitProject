package com.ecomm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.model.Category;

@Controller
public class Categorycontoller {
   
	@Autowired 
	CategoryDAO categoryDAO;
	
	@RequestMapping("/Category")
	public String showcategorypage(Model m) {
		return "Category";
	}
	
	@RequestMapping("/InsertCategory")
	public String insertcategory(@RequestParam("catName")String categoryName,@RequestParam("catdesc")String categorydesc) {
		Category category=new Category();
		category.setCategoryName(categoryName);
		category.setCategoryDesc(categorydesc);
		categoryDAO.addCategory(category);
		return "Category";
	}
}
