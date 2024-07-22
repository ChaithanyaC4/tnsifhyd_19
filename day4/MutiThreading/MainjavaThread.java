package com.day4.MutiThreading;

public class MainjavaThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoThread object=new DemoThread();
		
		object.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread "+Thread.currentThread().getId()+" is running..");
		}

	}

}
