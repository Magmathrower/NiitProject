package com.ecomm.Controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecomm.dao.CategoryDAO;
import com.ecomm.dao.ProductDAO;
import com.ecomm.model.Category;
import com.ecomm.model.Product;

@Controller
public class Productcontroller {

	@Autowired 
	ProductDAO productDAO;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/Product")
	public String showProductPage(Model m) {
	
		Product product=new Product();
			
		List<Product> productlist=productDAO.listProducts();
		
		m.addAttribute("product",product);
		m.addAttribute("productlist",productlist);
		
		List<Category> categorylist= categoryDAO.listCategories();
		m.addAttribute("categorylist",this.getCategorylist(categorylist));
		return "Product";
		
	}
	
	//Converting a List to a HashMap
	public LinkedHashMap<Integer,String> getCategorylist(List<Category> categorylist){
		
		LinkedHashMap<Integer,String> categorylist1= new LinkedHashMap<Integer,String>();
		
		for(Category category:categorylist) {
				
			categorylist1.put(category.getCategoryId(),category.getCategoryName());
		}
		
		return categorylist1;
	}
	
	@RequestMapping(value="/Insertproduct",method=RequestMethod.POST)
	public String insertproduct (@ModelAttribute("product")Product product,Model m) {
		Product product1=new Product();
		m.addAttribute("product", product1);
		productDAO.addProduct(product);
        List<Product> productlist=productDAO.listProducts();
		
		m.addAttribute("productlist", productlist);
		
		List<Category> categorylist= categoryDAO.listCategories();
		m.addAttribute("categorylist",this.getCategorylist(categorylist));
		
		return "Product";
	}
	
	
	
}
