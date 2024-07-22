package com.day3.MultipleInheritance;

public class ImplementationVehicle implements Vehicle,Flyable {

	
	public void start() {
		System.out.println("Flyyable Vehicle started");
		
	}
	
	public void fly() {
		System.out.println("Flyyable vehicle is flying");
		
	}

	

}
