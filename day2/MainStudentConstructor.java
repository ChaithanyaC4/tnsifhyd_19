package com.day2;



public class MainStudentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentConstructor s=new StudentConstructor();
		
		System.out.println(s.StudentResult());
		
		StudentConstructor s1=new StudentConstructor("vallabh",32,20,8.4);
		
		System.out.println(s1.StudentResult());
	}

}
