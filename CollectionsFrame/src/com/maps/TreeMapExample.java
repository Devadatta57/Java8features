package com.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
       TreeMap<String,Integer> h=new TreeMap<String,Integer>();
          h.put("dhoni",89);
          h.put("kohli",77);
          h.put("hardik",12);
          h.put("gill",34);
       
          String[] batsmen= {"dhoni","gill","kohli","hardik","shreyas","abhishek"};
          
//          for(Map.Entry<String,Integer> entry:h.entrySet()) {
//        	  System.out.println(entry.getKey()+":"+entry.getValue());
//          }
          
          for(String b:batsmen) {
        	  System.out.println(b+":"+h.getOrDefault(b,0));
          }
}
}
