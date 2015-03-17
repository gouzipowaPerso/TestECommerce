package com.mps.misys;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mps.misys.model.Product;
import com.mps.misys.service.ProductService;

public class AppTest {

	public static void main(String[] args) {
		// Loading the context file
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Service
		ProductService productService = (ProductService) context.getBean("productService");
		
		// Instantiation of an object Product
		Product product = new Product();
		product.setCategory("Action");
		product.setCreatedAt("");
	}

}
