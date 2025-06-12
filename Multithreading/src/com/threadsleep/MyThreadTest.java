package com.threadsleep;

public class MyThreadTest {
	public static void main(String args[]) {
		MyThread m=new MyThread();
		Thread t=new Thread(m);
		t.start();
		
	}
}
