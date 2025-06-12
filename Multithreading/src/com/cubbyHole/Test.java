package com.cubbyHole;

public class Test {
	public static void main(String args[]) {
		CubbyHole cb=new CubbyHole();
		
		Producer pro=new Producer(cb);
		
		Consumer con=new Consumer(cb);
		
		pro.start();
		con.start();
		
		
	}
}
