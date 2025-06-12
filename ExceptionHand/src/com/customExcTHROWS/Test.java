package com.customExcTHROWS;

public class Test {

	public static void main(String[] args) {
		Circle  c=new Circle(-2.3);
		try {
		  c.printArea();
		}
		catch(RadiusException e) {
			System.out.println(e.getMessage());
		}
		try {
		c.printPerimeter();
		}
		catch (RadiusException e) {
			System.out.println(e.getMessage());

		}

	}

}
