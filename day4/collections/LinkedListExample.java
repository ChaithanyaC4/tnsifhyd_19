package com.day4.collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		System.out.println("Enter LinkedList: ");
		for(int i=1;i<=5;i++) {
				ll.add(i);
		}
		
		System.out.println(ll);
		ll.add(6);
		System.out.println(ll);
		
		ll.remove(1);
		System.out.println(ll);
		
		
		ll.clear(); //clears all data in collection
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
	   }
		
		

	}

}
