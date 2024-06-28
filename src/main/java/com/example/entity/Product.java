package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Builder

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
