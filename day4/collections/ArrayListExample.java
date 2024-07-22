package com.day4.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		System.out.println("Enter ArrayList: ");
		for(int i=0;i<=5;i++) {
				al.add(sc.nextInt());
		}
		
		System.out.println(al);
		al.add(6);
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
	   }
		sc.close();

	}

}
