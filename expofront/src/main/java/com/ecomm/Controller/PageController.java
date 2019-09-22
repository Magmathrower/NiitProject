package com.ecomm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController 
{
	@RequestMapping("/login")
	public String showLoginPage()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public String showRegisterPage()
	{
		return "register";
	}
	
	@RequestMapping("/contactUs")
	public String showContactUsPage()
	{
		return "contactUs";
	}
}
