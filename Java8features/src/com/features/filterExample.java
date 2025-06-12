package com.features;
@FunctionalInterface
interface Filter{
	public boolean filt(int x);
}
class ArrayFilter{
	public static  void arrEle(int arr[],Filter obj) {
		for(int a:arr) {
			if(obj.filt(a)) {
				System.out.println(a);
			}
		}
	}
}
public class filterExample {
	public static void main(String[] args) {
		int arr[]= {123,34,54,65645,2323};
	ArrayFilter.arrEle(arr,(value)->{return value%3 ==0; });
	}
}
