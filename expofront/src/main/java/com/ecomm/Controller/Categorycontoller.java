package com.ecomm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
		List<Category> categorylist= categoryDAO.listCategories();
		m.addAttribute("categorylist",categorylist);
		return "Category";
	}
	
	@RequestMapping("/InsertCategory")
	public String insertcategory(@RequestParam("catName")String categoryName,@RequestParam("catdesc")String categorydesc,Model m) {
		Category category=new Category();
		category.setCategoryName(categoryName);
		category.setCategoryDesc(categorydesc);
		categoryDAO.addCategory(category);
		List<Category> categorylist= categoryDAO.listCategories();
		m.addAttribute("categorylist",categorylist);
		return "Category";
	}
	
	@RequestMapping("/deleteCategory/{categoryId}")
	public String deleteCategory(@PathVariable("categoryId")int categoryId,Model m) {
		Category category = categoryDAO.getCategory(categoryId);
		categoryDAO.deleteCategory(category); 
		List<Category> categorylist= categoryDAO.listCategories();
		m.addAttribute("categorylist",categorylist);
		return "Category";
	}
}
