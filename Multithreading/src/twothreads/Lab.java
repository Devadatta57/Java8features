package twothreads;

public class Lab extends Thread{

	 String msg;
	 public Lab(String msg) {
	     this.msg=msg;
	 }
	 
	 public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(msg+" "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
