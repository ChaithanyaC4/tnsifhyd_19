package com.day2;

public class TestStaticInstanceOverload {
	
	final public void foo() {
		System.out.println("foo() method called");
	}
	public void foo(int a) {
		System.out.println("foo(int a) method called");
	}
	
	public static void foo1() {
		System.out.println("foo1() method called");
	}
	
	public static void foo1(float b) {
		System.out.println("foo1(float b) method called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestStaticInstanceOverload si=new TestStaticInstanceOverload();
		
		si.foo();
		si.foo(2);
		
		foo1();
		foo1(76.45f);

	}

}
