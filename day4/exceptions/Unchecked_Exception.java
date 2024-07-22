package com.day4.exceptions;


public class Unchecked_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,3,4,5};
		
	
		
		int c=10/0;
		
		
		
		
		
		System.out.println("div result= "+c);
		System.out.println(a[6]); //Exception in thread "main" 
		//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		// at javaday12/exceptions.Unchecked_Exception.main(Unchecked_Exception.java:10)
		
		
	}

}
