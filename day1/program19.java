package com.day1;

public class program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {8,1,17,89,2,6,-1};
		int max = arr[0],min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max Element in array: "+max);
		System.out.println("Min Element in array: "+min);
	}

}
