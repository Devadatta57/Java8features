package ccom.Reservation;

public class Reservation implements Runnable{
	 int wanted;
     int available=2;
     public  Reservation(int wanted) {
    	 this.wanted=wanted;
     }
     @Override
     public synchronized void run() {
    	 String name=Thread.currentThread().getName();
    	 if(wanted<=available) {
    	 System.out.println("ticket booked for "+name);
    	 available=available-wanted;
    	 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 }
    	 else {
        	 System.out.println("Sorry no ticket for"+name);
    	 }
    	 
    	 
     }

}
