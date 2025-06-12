package com.customExc1;

public class Circle {
	
	private double radius;
	private double PI=3.14;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	


	public void printPerimeter() {
		try {
		if(radius<=0) {
			throw new RadiusException("invalid radius");
		}
		double per=2*PI*radius;
		System.out.println(per);
		}
		catch(RadiusException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void printArea() { 
		try {
		if(radius<=0) {
			throw new RadiusException("invalid radius");
		}
		double area=PI*radius*radius;
		System.out.println(area);
		}
		catch(RadiusException e) {
			System.out.println(e.getMessage());
		}
	}

}
