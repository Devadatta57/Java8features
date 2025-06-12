package com.queues;

import java.util.ArrayDeque;

public class ArrayDequeueExample {
	public static void main(String[] args) {
		ArrayDeque<Integer> a=new ArrayDeque<Integer>();
		a.add(23);
		a.add(35);
		a.add(89);
		a.add(23);
		a.addFirst(90);
		//System.out.println(a);

	//	a.removeLast();
		System.out.println(a);

		//a.remove();
		//System.out.println(a);

		//a.push(56);
		a.pop();
		
		//a.add(11);
		System.out.println(a);


	}
}
