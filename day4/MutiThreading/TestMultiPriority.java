package com.day4.MutiThreading;

public class TestMultiPriority extends Thread{

	public void run() {
		System.out.println("Running Thread Name: "+Thread.currentThread().getName());
		System.out.println("Running Thread Priority: "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestMultiPriority tp1=new TestMultiPriority();
		TestMultiPriority tp2=new TestMultiPriority();
		
		tp1.setPriority(MAX_PRIORITY);
		tp2.setPriority(MIN_PRIORITY);
		
		tp1.start();
		tp2.start();
		
		
	}

}
