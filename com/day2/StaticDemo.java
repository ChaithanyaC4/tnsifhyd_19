package com.day2;

public class StaticDemo {
	
	static int a=10;
	static float b=23.098f;
	double c=1.983087;
	
	static void callme() {
		System.out.println("value of a="+a);
		System.out.println("value of b="+StaticDemo.b);
//		System.out.println("value of c="+c); satic method cannot access instance variables                         
	}

}
