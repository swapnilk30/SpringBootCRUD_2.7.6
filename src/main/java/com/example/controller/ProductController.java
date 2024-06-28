package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts(){
		return ResponseEntity.ok(productService.getAllProduct());
	}
	
	//by page
	//http://localhost:8081/api/v1/products/page?pageNumber=1&pageSize=5
	@GetMapping("/page")
	public ResponseEntity<List<Product>> getAllByPage(
			@RequestParam(value = "pageNumber",defaultValue = "0",required = false) int pageNumber,
			@RequestParam(value = "pageSize",defaultValue = "5",required = false) int pageSize){
		
		List<Product> allProductByPage = productService.getAllProductByPage(pageNumber, pageSize);
		
		return ResponseEntity.ok(allProductByPage);
	}
	

}
