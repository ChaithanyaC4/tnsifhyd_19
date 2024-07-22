package com.day2;

public class CarGetSet {
	
	private String empName;
	private int empAge;
	private int empId;
	private double empSalary;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return empAge;
	}
	public void setAge(int age) {
		this.empAge = age;
	}
	public int getEmpid() {
		return empId;
	}
	public void setEmpid(int empid) {
		this.empId = empid;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public void Employee() {
		System.out.println("Hello Coder, I "+empName+" With age "+empAge+" bearing Id "+empId+" getting salary "+empSalary);
	}
	

}
