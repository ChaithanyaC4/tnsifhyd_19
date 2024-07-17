package com.day2;

import java.math.BigInteger;
import java.util.Scanner;

public class ScannerNextBigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Give BigInteger input a: ");
		BigInteger a=input.nextBigInteger();
		
		System.out.println("value of a="+a);
		
		input.close();

	}

}
