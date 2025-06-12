package com.arithmetic1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalyUse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=0;int b=0;
		try {
		System.out.println("Enter a");
		 a=sc.nextInt();
		
		System.out.println("enter b:");
		 b=sc.nextInt();
		
		
		int c=a/b;
		System.out.println(c);
		
		}
		catch(ArithmeticException e) {
			System.out.println("dont divide by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("input mismatch");
		}
		catch(Exception e) {
			System.out.println("exception");

		}
		finally {
			System.out.println(a+" "+b);
		}
		
		
	}
}
