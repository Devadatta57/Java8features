package com.arithmetic;

import java.util.Scanner;

public class ArrayIndexOutOfBoundExc {
	public static void main(String args[]) {
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("Enter index:");
		int index=sc.nextInt();
		System.out.println("Enter a:");
		int value=sc.nextInt();
		a[index]=value;
		System.out.println(a[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound");
		}
		
		
	}
}
