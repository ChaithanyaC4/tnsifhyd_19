package com.day4.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet<String> ts=new TreeSet<String>();
		

		
		ts.add("For");
		ts.add("Java");
		ts.add("python");
		ts.add("c,c++");
		
		Iterator<String> itr = ts.iterator();

        // Print elements of the HashSet
        System.out.println("Elements of TreeSet"
        		+ ": ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
		
	}

}
