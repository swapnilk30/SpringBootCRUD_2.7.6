package com.example.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	@Autowired
	@Qualifier("pdf")
	private IReport iReport;// ByType
	
	// changed refference variable name as implementation class name 
	//private IReport excelReport;
	//private IReport pdfReport;
	
	public void downloadReport(){
		iReport.generateReport();
	}
}
