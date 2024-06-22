package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.component.ReportService;

@SpringBootApplication
public class SpringBootCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootCrudApplication.class, args);
		
		ReportService service = context.getBean(ReportService.class);
		
		service.downloadReport();
	}

}
