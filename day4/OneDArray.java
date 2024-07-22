package com.day4;

import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int b[]=new int[5];
		int c[]= {5,10,15,20,25,30};

		System.out.println("Enter the Array elements of b:");
		for(int i=0;i<b.length;i++) {
			b[i]=input.nextInt();
		}
		
		System.out.println("Array elements of a:");
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]= "+a[i]+" ");
		}
		
		System.out.println();
		System.out.println("Array elements of b:");
		for(int i=0;i<b.length;i++) {
			System.out.print("b["+i+"]= "+b[i]+" ");
		}
		
		System.out.println();
		System.out.println("Array elements of C:");
		for(int i=0;i<c.length;i++) {
			System.out.print("c["+i+"]= "+c[i]+" ");
		}
		input.close();

	}

}
