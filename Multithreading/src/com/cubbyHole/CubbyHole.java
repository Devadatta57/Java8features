package com.cubbyHole;

public class CubbyHole {
	private boolean available;
	private int item;
	
	public synchronized int get() {
		if(available==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		available=false;
		notifyAll();
		return item;
	}
	public synchronized void put(int i) {
		
		if(available==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notifyAll();
		item=i;
		available=true;
		
	}

}
