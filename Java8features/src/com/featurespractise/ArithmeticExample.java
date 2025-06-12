package com.featurespractise;
@FunctionalInterface
interface Arithmetic{
	public int operation(int a,int b);
}
class ArithmeticHigher{
	public static int doOperation(int a,int b,Arithmetic obj) {
		return obj.operation(a, b);
	}
}
public class ArithmeticExample {
	public static void main(String[] args) {
	System.out.println(ArithmeticHigher.doOperation(231,34,(a,b)->{return a+b;}));
	System.out.println(ArithmeticHigher.doOperation(231,34,(a,b)->{return a-b;}));
	System.out.println(ArithmeticHigher.doOperation(231,34,(a,b)->{return a*b;}));

	}
}
