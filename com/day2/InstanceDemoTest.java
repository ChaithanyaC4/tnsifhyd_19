package com.day2;

public class InstanceDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceDemo id=new InstanceDemo();
		
		id.callme();
		System.out.println("value of a="+id.a);
		System.out.println("value of c="+InstanceDemo.c);

	
	}

}
