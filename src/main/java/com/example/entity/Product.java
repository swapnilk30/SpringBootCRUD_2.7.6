package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	private String productId;
	
	private String title;
	
	private String description;
	
	private double price;
	
	private int quantity;
	
	private Date addedDate;
}
