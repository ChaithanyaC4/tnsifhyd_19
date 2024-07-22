package com.day4.MutiThreading;

public class DemoRunnable implements Runnable {
	
	
	public void run() {
		
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Thread "+Thread.currentThread().getId()+" is Running..");
			}
			
		} catch (Exception e) {
			System.out.println("Exception Occured: "+e);
		}
		
	}
}