package com.day2;

import java.math.BigDecimal;

import java.util.Scanner;

public class ScannerNextBigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.print("Give BigDecimal input a: ");
		BigDecimal a=input.nextBigDecimal();
		
		System.out.println("value of a="+a);
		
		input.close();
	}

}
