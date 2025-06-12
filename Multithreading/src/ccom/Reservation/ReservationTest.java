package ccom.Reservation;

public class ReservationTest{
	public static void main(String args[]) {
    Reservation r=new Reservation(2);//two tickets for each out of 3 threads,so booked for only one
   // Reservation r=new Reservation(1);// one ticket per thread out of three so booked for two threads 

    Thread t=new Thread(r,"devadatta");
    Thread t1=new Thread(r,"datta");
    Thread t2=new Thread(r,"hala");
    t.start();
    t1.start();
    t2.start();
  
	}
}
