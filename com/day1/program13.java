package com.day1;

import java.util.Scanner;

public class program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the year: ");
		
		int year=input.nextInt();
		
		boolean isLeapYear=((year%4==0 && year%400!=0)||year%400==0);
		
		if(isLeapYear) {
			System.out.println("Year is leap year");
		}
		else {
			System.out.println("Year is not leap year");
		}
		input.close();
	}

}
