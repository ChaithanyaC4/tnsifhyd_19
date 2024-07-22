package com.day5.Stream_DTApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTimeFormatterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate currentDate=LocalDate.now();
		DateTimeFormatter dateformat=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate=currentDate.format(dateformat);
		
		System.out.println(formattedDate);
		 String dateString = "20-07-2024";
	     LocalDate parsedDate = LocalDate.parse(dateString, dateformat);
	     System.out.println("Parsed Date: " + parsedDate);

		LocalDateTime currentDateTime=LocalDateTime.now();
		DateTimeFormatter dateTimeFormat=DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
		String formattedDateTime=currentDateTime.format(dateTimeFormat);
		System.out.println(formattedDateTime);
		
		String dateTimeString = formattedDateTime;
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, dateTimeFormat);
        System.out.println("Parsed DateTime: " + parsedDateTime);
	}

}
