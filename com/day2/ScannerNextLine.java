package com.day2;

import java.util.Scanner;

public class ScannerNextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.print("Give one line input s: ");
		String s=input.nextLine();
		
		System.out.println("value of s="+s);
		
		input.close();
	}

}
