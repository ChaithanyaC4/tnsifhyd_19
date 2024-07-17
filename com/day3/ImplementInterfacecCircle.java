package com.day3;

public class ImplementInterfacecCircle implements InterfaceShape {

	private double radius;
	
	public ImplementInterfacecCircle(double radius) {
		this.radius=radius;
	}
	
	@Override
	
	public void area() {
		System.out.println("Area of Circle= "+(Math.PI*radius*radius));
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of Circle= "+(Math.PI*2*radius));
		
	}
}
