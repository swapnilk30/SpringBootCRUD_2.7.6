package com.example.component;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReport implements IReport{

	@Override
	public void generateReport() {
		System.out.println("generating pdf report ....");
		
	}

}
