package com.example.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("excel")
//@Primary
public class ExcelReport implements IReport{

	@Override
	public void generateReport() {
		System.out.println("generating the excel report ....");
		
	}

}
