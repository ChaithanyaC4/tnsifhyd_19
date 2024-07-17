package com.day1;

import java.util.Scanner;

public class program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num=input.nextInt();
		int temp=num;
		int rem,result=0,power=1;
		
		while(num!=0) {
			rem=num%10;
			power=rem*rem*rem;
			result+=power;
			num=num/10;
		}
		if(result==temp) {
			System.out.println(temp+" is Armstrong number");
		}
		else {
			System.out.println(temp+" is not Armstrong number");
		}
		input.close();
	}

}
