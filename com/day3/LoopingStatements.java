package com.day3;


import java.util.Scanner;

public class LoopingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for loop
		int num1=8;
		int size=10;
		
		System.out.println("Multiplication table of "+num1);
		for(int i=1;i<=size;i++) {
			System.out.println(num1+" * "+i+" = "+ num1*i);
		}
		
		//While Loop
		System.out.println("Values Back from 8>");
		while(num1>0) {
			System.out.println(num1);
			num1--;
		}
		System.out.println();
		int a=0;
		int b=1;
		int length=10;
		
		int i=0;
		while(i<=length-1) {
            System.out.println(a);
			int c=a+b;
			
			a=b;
			b=c;
			i++;
		}
		
		//do while loop
		String OriginalPassword="vallabh@!23";
		Scanner input=new Scanner(System.in);
		String password="";
		
		do {
			System.out.println("Enter password: ");
			password=input.next();
			
		}while(!password.equals(OriginalPassword));
		System.out.println("Access Granted");
		
		//Enhanced Forloop
		
		String colours[]= {"Blue","Yellow","Red","Pink"};
		
		System.out.println("Colours in color array[] : ");
		
		for(String color:colours) {
			System.out.println(color);
		}
		
		input.close();
	}

}
