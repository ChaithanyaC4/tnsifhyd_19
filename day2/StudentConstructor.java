package com.day2;

public class StudentConstructor {

	private String sName;
	private int sId;
	private int sAge;
	private double sGrade;
	
	public StudentConstructor() {
		sName="Ravan";
		sId=69;
		sAge=21;
		sGrade=7.2;
	}
	
	public StudentConstructor(String name,int id,int age,double grade) {
		this.sName=name;
		this.sId=id;
		this.sAge=age;
		this.sGrade=grade;
		
	}
	
	public 	String StudentResult() {
		if(sGrade>=5) {
			return sName+":"+"Passed";
		}
		else {
			return sName+":"+"Failed";
		}
	}
}
