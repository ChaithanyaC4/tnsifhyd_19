package com.day1;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,c;
		
		
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number upto which you want to end fibnacci series: ");
		
		int num=input.nextInt();
		
		System.out.print("fibnacci series:"+a+" "+b+" ");
		for(int i=0;i<=10;i++) {
			c=a+b;
			if(c<=num) {
				System.out.print(c+" ");
			}
			else {
				break;
			}
			
			a=b;
			b=c;
		}
		input.close();
		

	}

}
