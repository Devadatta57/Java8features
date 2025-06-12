package com.lists;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]) {
    	ArrayList<String> al=new ArrayList<String>();
    	al.add("bhavya");
    	al.add("deva");
    	al.add("darha");
    	al.add("datta");
    	al.add("deva");
    	al.add("bhavya");
//    	System.out.println(al.indexOf("darha"));
//    	System.out.println(al.get(4));
//    	System.out.println(al.lastIndexOf("bhavya"));
//    	System.out.println(al.contains("darha"));
    	//System.out.println(al.remove(0));
//    	System.out.println(al.remove("bhavya"));
//    	System.out.println(al);
//    	System.out.println(al.remove("bhavya"));
//    	System.out.println(al);
//    	System.out.println(al.remove("bhvya"));
//    	System.out.println(al);
    	//al.clear();
    	ArrayList<String> bl=new ArrayList<String>(100);

        al.addFirst("ert");
        bl.addAll(al);
        bl.set(1,"tyu");
       
//    	System.out.println(bl);
//    	System.out.println(  bl.isEmpty());
//    	for(String i:bl) {
//    		System.out.println(i.toLowerCase());
//    	}
//    	System.out.println(bl.size());
//    	String[] a=new String[bl.size()];
//        a= bl.toArray(a);
//        for(String s:a) {
//        	System.out.println(s+"");
//        }
      //  System.out.println(bl.subList(1, 4));
        System.out.println(bl.size());
         bl.trimToSize();
         System.out.println(bl.size());

    	
    }
}
