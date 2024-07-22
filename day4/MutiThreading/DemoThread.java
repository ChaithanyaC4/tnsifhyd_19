package com.day4.MutiThreading;

public class DemoThread  extends Thread{

	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("Thread "+Thread.currentThread().getId()+" is running");
			}
			
		} catch (Exception e) {
			System.out.println("Exception Occuired: "+e);
		}
	}
	
}
