package com.day4.collections;
import java.util.ArrayDeque;

public class ArrayDequeueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
		
		for(int i=1;i<=5;i++) {
			ad.add(i);
		}
		System.out.println("ArrayDequeue elements: "+ad);
		
		ad.addFirst(1);
		System.out.println("ArrayDequeue elements: "+ad);
		
		ad.addLast(6);
		System.out.println("ArrayDequeue elements: "+ad);
		
		ad.remove(1);
		System.out.println("ArrayDequeue elements: "+ad);
		
		ad.clear();
		System.out.println("ArrayDequeue elements: "+ad);
	}

}
