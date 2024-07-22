package com.day2;

public class Derived extends Base {

	public void display() {
		System.out.println("Instance content from derived class");
		super.display();
	}
	public static String display1() {
		return "Static method content from derived class";
		
	}


}
