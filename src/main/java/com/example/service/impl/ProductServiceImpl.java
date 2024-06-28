package com.example.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	

	@Override
	public Product saveProduct(Product product) {
		// Generate random product Id
		product.setProductId(UUID.randomUUID().toString());
		
		// added date
		product.setAddedDate(new Date());
		
		Product savedProduct = productRepository.save(product);
		
		return savedProduct;
	}
	
	//
	@Override
	public List<Product> getAllProduct() {
		
		return productRepository.findAll();
	}


	//
	@Override
	public List<Product> getAllProductByPage(int pageNumber, int pageSize) {
		
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		
		Page<Product> getAllProductByPage = productRepository.findAll(pageable);
		
		List<Product> content = getAllProductByPage.getContent();
		
		return content;
	}

}
