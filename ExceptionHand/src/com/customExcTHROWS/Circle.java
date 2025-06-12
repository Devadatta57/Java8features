package com.customExcTHROWS;

public class Circle {
	
	private double radius;
	private double PI=3.14;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	


	public void printPerimeter()throws RadiusException{
		if(radius<=0) {
			throw new RadiusException("invalid radius");
		}
		double per=2*PI*radius;
		System.out.println(per);
		
	}
	
	public void printArea() throws RadiusException{ 
		if(radius<=0) {
			throw new RadiusException("invalid radius");
		}
		double area=PI*radius*radius;
		System.out.println(area);
	}

}
