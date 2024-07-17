package com.day1;

import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.print("a:");
		double a=input.nextDouble();
		System.out.print("b:");
		double b=input.nextDouble();
		
		double avg=(a+b)/2;
		
		System.out.println("average of 2 numbers= "+avg);
		input.close();
	}

}
