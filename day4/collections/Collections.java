package com.day4.collections;

import java.util.Hashtable;
import java.util.Vector;



public class Collections {

	public static void main(String[] args) {
		
		int a[]=new int [] {1,2,3,4,5};
		
		Vector<Integer> v=new Vector<Integer>();
		
		v.addElement(5);
		v.addElement(6);
		v.addElement(7);
		v.addElement(8);
		v.addElement(9);
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		
		ht.put(1, "Vamshi");
		ht.put(2, "Ravan");
		ht.put(3, "Srikanth");
		ht.put(4, "Nagesh");
		ht.put(5, "Rakesh");
		
		System.out.println("Elements of array a[]: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Elements of vector v: ");
		for(int i=0;i<v.size();i++) {
			System.out.print(v.elementAt(i)+" ");
		}
		System.out.println();
		
		System.out.println("Elements of  Hashtable ht: ");
		for(int i=1;i<ht.size();i++) {
			System.out.print(i+"."+ht.get(i)+" ");
		}
		
		
	}

}
