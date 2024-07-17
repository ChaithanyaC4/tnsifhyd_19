package com.day1;

import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter Three digits to find max of them:");
		
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is Greater than all");
		}
		else if (b>a && b>c) {
			System.out.println("B is greater than all");
		}
		else {
			System.out.println("C is greater than all");
		}
		
		input.close();
	}

}
