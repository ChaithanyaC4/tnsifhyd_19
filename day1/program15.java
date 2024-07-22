package com.day1;

import java.util.Scanner;

public class program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter n value:");
		int n=input.nextInt();
		
		int sum=0;
		
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("sum of n natural numbers= "+sum);
		
		input.close();
	}

}
