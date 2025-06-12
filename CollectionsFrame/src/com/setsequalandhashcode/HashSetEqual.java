package com.setsequalandhashcode;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEqual {
	public static void main(String args[]) {
	HashSet<Faculty> h=new HashSet<Faculty>();
	h.add(new Faculty(12,"deva", 23));
	h.add(new Faculty(33,"datta",67));
	h.add(new Faculty(12,"deva",23));
	h.add(new Faculty(33,"datta",67));
	h.add(new Faculty(83,"latha",87));
	h.add(new Faculty(33,"atta",67));
	
	Iterator i=h.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	Faculty f=new Faculty(1,"deva",34);  
	Faculty f2=new Faculty(1,"deva",34);
	System.out.println(f.equals(f2));
	System.out.println(f.hashCode());
	System.out.println(f2.hashCode());
		
	}
}
