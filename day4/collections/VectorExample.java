package com.day4.collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v=new Vector<String>();
		
		String[] s= {
				"Vallabh",
				"Suresh",
				"Venkat",
				"Ramesh",
				"Ravan" };
		
		for(String name:s) {
			v.add(name);
		}
		
		System.out.println("Vector Elements: "+v);
		
		v.remove(3);
		System.out.println("Vector Elements after remove: "+v);
		
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
	   }
	}

}
