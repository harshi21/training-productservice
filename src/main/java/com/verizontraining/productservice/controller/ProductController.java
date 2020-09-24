package com.verizontraining.productservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizontraining.productservice.model.Product;

@RestController
public class ProductController {

	
	@GetMapping("/get-products")
	public List<Product> getProducts(){
		List<Product> prodList = new ArrayList<>();
		Product prod1 = new Product("Iphone 12", 699.00 );
		prodList.add(prod1);
		Product prod2 = new Product("Samsung Galaxy M2", 599.00 );
		prodList.add(prod2);
		return prodList;
		
		
	}
}
