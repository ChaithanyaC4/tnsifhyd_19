package com.day1.protected2;

import com.day1.protected1.A;

public class B extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1 = new B();
		b1.display(); // protected scope is outside other packages also but only through inheritence.

	}

}
