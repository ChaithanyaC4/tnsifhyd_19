package com.day1;

import java.util.Scanner;

public class program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num=input.nextInt();
		
		System.out.println("Enter range of multiplication: ");
		int range=input.nextInt();
		
		for(int i=1;i<=range;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		input.close();
		
	}

}
