package com.day2;

import java.util.Scanner;

public class ScannerNextDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.print("Give Double input a: ");
		double a=input.nextDouble();
		
		System.out.println("value of a="+a);
		
		input.close();
	}

}
