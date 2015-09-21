package com.jovt.java.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TransformationService {

	// Transfrom input data (2D field) - in format [java.util.Date, int] to output(single String) on format ['formatted_date_using_pattern', x%]
	//
	//
	
	String transformData(final Object[] data, final String pattern){
		
		Date date = (Date) data[0];
		int percentage = (Integer) data[1];
		StringBuilder resultLine = new StringBuilder("['");
		
		resultLine.append(new SimpleDateFormat(pattern).format(date));
		
		resultLine.append("',");
		resultLine.append(percentage);
		resultLine.append("%]");
		
		return resultLine.toString();
		
		
	}
}
