package com.day4.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String>stack=new Stack<String>();
		
		String[] s= {
				"Vallabh",
				"Suresh",
				"Venkat",
				"Ramesh",
				"Ravan" };
		
		
		for(String name:s) {
			stack.push(name);
		}
		
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		stack.pop();

		itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(stack);
	}

}
