package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	
	// POST http://localhost:8080/home/save
	@PostMapping("/save")
	public String getHome(@RequestParam("name") String name) {
		
		return "Welcome to AlgoWebPro!!" + name;
	}
	
	

}
