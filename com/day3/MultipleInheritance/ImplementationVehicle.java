package com.day3.MultipleInheritance;

public class ImplementationVehicle implements Vehicle,Flyable {

	@Override
	public void start() {
		System.out.println("Flyyable Vehicle started");
		
	}
	@Override
	public void fly() {
		System.out.println("Flyyable vehicle is flying");
		
	}

	

}
