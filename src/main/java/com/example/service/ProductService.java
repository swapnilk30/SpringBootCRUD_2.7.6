package com.example.service;

import java.util.List;

import com.example.entity.Product;

public interface ProductService {
	
	
	//create
	Product saveProduct(Product product);
	
	// get All Products
	List<Product> getAllProduct();
	
	// get All products by page
	List<Product> getAllProductByPage(int pageNumber,int pageSize);

}
