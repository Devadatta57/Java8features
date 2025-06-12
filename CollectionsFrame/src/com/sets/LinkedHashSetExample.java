package com.sets;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
	  LinkedHashSet<String> h=new LinkedHashSet<String>();
	  HashSet<String> h1=new HashSet<String>();
	  h.add("deva");
	  h.add("datta");
	  h.add("para");
	  h.add("hara");
	  h.add("iop");
	  h.add("hara");
	  h.add("iop");
//	  h.add(null);
//	  h.add(null);
	  h1.addAll(h);
	  System.out.println(h);
////	  System.out.println(h.contains("hara"));
//	  System.out.println(h.equals(h1));
//	  for(String s:h) {
//		  System.out.println(s.toCharArray());
//	  }
//	  System.out.println(h.toArray());
//		  h.remove("datta");
	  
	}
}
