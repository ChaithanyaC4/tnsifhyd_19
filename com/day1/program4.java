package com.day1;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter num: ");
	  int num=input.nextInt();
	  int count=0;
	  
	  if(num>0) {
		  for(int i=1;i<=num;i++) {
			  if(num%i==0) {
				  count++;
			  }
			  
		  }
		  if(count==2) {
			  System.out.println("num is  prime");
		  }
		  else {
			  System.out.println("num is not prime");
		  }
		 
		  
	  }
	  else {
		  System.out.println("num is not prime");
	  }
	 
	  
	  input.close();

	}

}
