package com.day3;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		
		
		//If statement
		if(a>0) {
			System.out.println( a+" is positive");
		}

		//IfElse Statement
		
		if(a%2==0) {
			System.out.println(a+" is Even Number");
		}
		else {
			System.out.println(a+" is odd Number");
		}
		
		//if-else-if statement
		
		int marks=56;
		
		if(marks>=90) {
			System.out.println("First Class Pass");
		}
		else if(marks>=70) {
			System.out.println("Second Class Pass");
		}
		else if(marks>=50) {
			System.out.println("Third Class Pass");
			
		}
		else {
			System.out.println("Fail,Prepare well Next Time");
		}
		
		//Nested-if Statement
		
		int age=23;
		
		if(age>=18) {
			System.out.println("Eligible to Vote.");
			if(age>=21) {
				System.out.println("You can have alchohol");
			}
		}
		else {
			System.out.println("Not Eligible to Vote.");
		}
		
		//Switch Statement
		
		int num1=10;
		int num2=15;
		
		int key=5;
		switch (key) {
		case 1: 
			System.out.println("Addition num1+num2="+(num1+num2));
			break;
		case 2: 
			System.out.println("Subtraction num1-num2="+(num1-num2));
			break;
		case 3: 
			System.out.println("Multiplication num1*num2="+(num1*num2));
			break;
		case 4: 
			System.out.println("Division num1/num2="+(num1/num2));
			break;
		case 5: 
			System.out.println("Modulus num1%num2="+(num1%num2));
			break;
		default:
			System.out.println("Invalid Key "+key);
		}
		
	}

}
