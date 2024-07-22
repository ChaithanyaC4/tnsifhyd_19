package com.day1;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter num value: ");
	 int num=input.nextInt();
	 
	 if(num%2==0) {
		 System.out.println("Num is even number");
	 }
	 else {
		 System.out.println("Num is odd");
	 }
	 input.close();

	}

}
