package ThreadPriorities;

public class Priorities {
	public static void main(String[] args) {
	Thread t=new Thread();
	t.setName("deva");
	Thread t1=new Thread();
	t1.setName("datta");
	Thread t2=new Thread();
	t2.setName("hello");
	
	t.setPriority(Thread.MIN_PRIORITY);
	t1.setPriority(3);
	t2.setPriority(Thread.MAX_PRIORITY);
	
	System.out.println(t.getPriority()+" "+Thread.currentThread());
	System.out.println(t1.getPriority()+" "+Thread.currentThread());
	System.out.println(t2.getPriority()+" "+Thread.currentThread());


	}

}
