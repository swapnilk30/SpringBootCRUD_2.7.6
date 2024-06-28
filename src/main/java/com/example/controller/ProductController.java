package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.ProductService;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
	
	@Autowired
	 private ProductService productService;
	
	
	//
	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		
		Product saveProduct = productService.saveProduct(product);
		
		return new ResponseEntity<>(saveProduct,HttpStatus.CREATED);
	}
	
	
	//products
	public ResponseEntity<List<Product>> getAllProducts(){
		return ResponseEntity.ok(productService.getAllProduct());
	}
	

}
