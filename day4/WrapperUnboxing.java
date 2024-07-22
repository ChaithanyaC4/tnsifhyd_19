package com.day4;

public class WrapperUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer aobj=Integer.valueOf(20);
		Float bobj=Float.valueOf(0.67f);
		Double cobj=123.68;
		
		int a=aobj.intValue();
		float b=bobj.floatValue();
		double c=cobj;
		
		System.out.println("value of a= "+a);
		System.out.println("value of b= "+b);
		System.out.println("Value of c= "+c);
	}

}
