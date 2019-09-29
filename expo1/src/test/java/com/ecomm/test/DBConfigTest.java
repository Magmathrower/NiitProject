package com.ecomm.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DBConfigTest 
{
	
	public static void main(String ar[])
   {
	   System.out.println("Testing");
	   AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	   context=new AnnotationConfigApplicationContext(); 
	   context.scan("com.ecomm");
	  System.out.println("Rahul is Trying"); 
	  context.refresh(); 
    }
}

