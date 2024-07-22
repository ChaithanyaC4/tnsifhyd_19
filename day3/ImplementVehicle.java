package com.day3;

public class ImplementVehicle extends VehicleAbstractClass{

	@Override
	void start() {
		System.out.println("Car started");
	}

	@Override
	void stop() {
		System.out.println("Car stoped");	
	}
}
