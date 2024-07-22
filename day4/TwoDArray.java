package com.day4;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int arr[][]= {{1,2,3},{3,4,5}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Enter arr["+i+"]["+j+"]= ");
				arr[i][j]=input.nextInt();
			}
			
		}
		
		int arr1[][]=new int[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("Enter arr1["+i+"]["+j+"]= ");
				arr1[i][j]=input.nextInt();
			}
			
		}
		System.out.println("arr1[] Elements:");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j]+" ");
				
			}
			System.out.println();
			
		}
		input.close();
	}

}
