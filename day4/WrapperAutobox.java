package com.day4;

public class WrapperAutobox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		float b=20.90f;
		double c=23.67778;
		
		
		Integer aobj=Integer.valueOf(a);
		Float bobj=Float.valueOf(b);
		Double cobj=c;
		
		if(aobj instanceof Integer) {
			System.out.println("An object of a is created..");
		}
		if(bobj instanceof Float) {
			System.out.println("An object of b is created..");
		}
		if(cobj instanceof Double) {
			System.out.println("An object of c is created..");
		}
	}

}
