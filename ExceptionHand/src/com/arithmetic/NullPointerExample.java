package com.arithmetic;

public class NullPointerExample {
	public static void main(String args[]) {
		try {
		String s=null;
		System.out.println(s.toLowerCase());
		}
		catch(NullPointerException e) {
			System.out.println("null pointer");
		}
		
		
		
	}
}
