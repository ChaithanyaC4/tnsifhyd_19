package com.day4.MutiThreading;

public class MainRunnableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread(new DemoRunnable());
		t1.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Main Thread "+Thread.currentThread().getId()+" is running ..");
		}

	}

}
