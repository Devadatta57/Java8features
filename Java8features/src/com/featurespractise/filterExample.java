package com.featurespractise;

@FunctionalInterface
interface Filter{
	public boolean makefilter(int x);
}
class FilterDO{
	public static void doFilter(int[] arr,Filter obj) {
		for(int a:arr) {
			if(obj.makefilter(a)) {
				System.out.println(a);
			}
		}
	}
}
public class filterExample {
	public static void main(String[] args) {
		int a[]= {12,232,123123,2323};
	 FilterDO.doFilter(a,(value)->{return value%4==0;});
		
	}
}
