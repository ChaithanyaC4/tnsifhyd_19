package com.day2;

import java.util.Scanner;

public class ScannerNextInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Give int input a: ");
		int a=input.nextInt();
		
		System.out.println("value of a="+a);
		
		input.close();

	}

}
