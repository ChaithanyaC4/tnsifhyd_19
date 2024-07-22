package com.day5.Stream_DTApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time_Date_APIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
	}

}
