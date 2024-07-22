package com.day4.exception_handling;

public class Excep_Handling_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//code that may raise exception
			int a=10/0;
			int b=2;
			int c=3;
			float d=b*c;
			
			
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("I will be executed even if exception handled or not");
		}
		System.out.println("Rest of Code....");
		

	}

}
