package com.day2;

public class InstanceDemo {
	int a=23;
	int b=12;
	static boolean c=false;
	
	void callme() {
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		System.out.println("value of c="+c); //instance method can access static variables
	}

}
