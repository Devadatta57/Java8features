package com.cubbyHole;

public class Producer extends Thread{
	
  private CubbyHole cb;

public Producer(CubbyHole cb) {
	super();
	this.cb = cb;
}
  public void run() {
	  for(int i=1;i<=10;i++) {
		  cb.put(i);
		  System.out.println("Producer put item "+i);
		  try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  }

}
