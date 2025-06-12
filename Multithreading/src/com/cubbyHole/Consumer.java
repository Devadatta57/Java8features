package com.cubbyHole;

public class Consumer extends Thread{
	  private CubbyHole cb;

	public Consumer(CubbyHole cb) {
		super();
		this.cb = cb;
	}

	public void run() {
		for(int i=1;i<=10;i++) {
		   int item=cb.get();
		   System.out.println("consumer got item "+item);
		   try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
