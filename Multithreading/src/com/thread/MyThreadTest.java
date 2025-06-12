package com.thread;

public class MyThreadTest {
	public static void main(String args[]) {
		MyThread t=new MyThread();
		t.setName("deva");
		MyThread t1=new MyThread();
		t1.setName("datta");
		MyThread t2=new MyThread();
		t2.setName("hello");
		
		t.start();
		t1.start();
		t2.start();
		
		
	}
}
