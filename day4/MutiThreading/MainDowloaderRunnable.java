package com.day4.MutiThreading;

public class MainDowloaderRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] files= {
		             "file1.zip",
		             "file2.zip",
		             "file3.zip",
		             "file4.zip",
		             "file5.zip"
		            };
		
		for(String file:files) {
			Thread t1=new Thread(new DownloadTask(file));
			t1.start();
		}
		
		

	}

}
