package com.day1;

import java.util.Scanner;

public class program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num=input.nextInt();
		int reversednum=0;
		
		while(num!=0) {
			int digit=num%10;
			reversednum=reversednum*10+digit;
			num/=10;
		}
		System.out.println("Reversedmumber= "+reversednum);
		input.close();
	}

}
