package com.day2;

public class TestBaseDerivedOverrideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived d= new Derived();
		d.display();
//		System.out.println(d.display1()); //cannot override static method
		System.out.println(Derived.display1());
		System.out.println(Base.display1());
		
		

	}

}
