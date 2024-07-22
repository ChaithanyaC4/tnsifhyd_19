package com.day4.exception_handling;

public class MutipleCatchBlock_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a[]=new int[5];
			int b[]=new int[2];
			
			b[2]=10/0;
			
			a[5]=10/0;
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
			
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}catch (Exception e) {
			System.out.println("Execption");
		}

}

}
