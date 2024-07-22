package com.day4.MutiThreading;

public class DownloadTask implements  Runnable {
	
	public String fileName;
	
	public DownloadTask(String fileName) {
		this.fileName=fileName;
	}
	
	
	public void run() {
		try {
			System.out.println(fileName+" is downloading..");
			Thread.sleep((long) Math.random()*1000);
			System.out.println(fileName+" is downloading completed");
			
		} catch (Exception e) {
			
		   System.out.println("File not downloaded: "+e);
		}
	}
}
