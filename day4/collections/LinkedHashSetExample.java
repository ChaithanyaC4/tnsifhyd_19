package com.day4.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		
		lh.add("Geeks");
		lh.add("For");
		lh.add("Java");
		lh.add("python");
		lh.add("c,c++");
		
		Iterator<String> itr = lh.iterator();

        // Print elements of the HashSet
        System.out.println("Elements of LinkedHashSet: ");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
		
		
	}

}
