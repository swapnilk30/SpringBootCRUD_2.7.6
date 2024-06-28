package com.example.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

	
	private ProductRepository productRepository;
	
	// Constructor Injection
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	
	//
	@Override
	public List<Product> getAllProduct() {
		
		return productRepository.findAll();
	}

}
