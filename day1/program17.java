package com.day1;

import java.util.Scanner;

public class program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter number :");
		int num=input.nextInt();
		
		int count=0;
		
		while(num!=0) {
			
			count++;
			num/=10;
			
		}
		System.out.println("no.of digits="+count);
		input.close();

	}

}
