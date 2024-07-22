package com.day1;

public class program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=325;
		int sum=0;
		
		
		
		while(num!=0) {
			sum+=num%10;
			num/=10;
		}
		System.out.println("sum of digits= "+sum);
		

	}

}
