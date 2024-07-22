package com.day4;

public class MainStudentAOB {

	public static void main(String[] args) {
		StudentArrayOfObjects arr[]=new StudentArrayOfObjects[5];
		
		arr[0]=new StudentArrayOfObjects(21,"Vallabh");
		arr[1]=new StudentArrayOfObjects(13, "suresh");
		arr[2]=new StudentArrayOfObjects(19, "Ganesh");
		arr[3]=new StudentArrayOfObjects(20, "Venkat");
		arr[4]=new StudentArrayOfObjects(31, "Nagesh");

		System.out.println("Contents of array");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]: "+"RollNo= "+arr[i].Rollno+" Name= "+arr[i].Name);
		}
	}
}
