package com.maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		 TreeMap<String,Integer> h=new TreeMap<String,Integer>();
         h.put("dhoni",h.getOrDefault("dhoni",0)+89);
         h.put("kohli",h.getOrDefault("kohli", 0)+77);
         h.put("hardik",h.getOrDefault("hardik",0)+12);
         h.put("gill",h.getOrDefault("gill", 0)+34);
         h.put("dhoni",h.getOrDefault("dhoni",0)+89);
         h.put("kohli",h.getOrDefault("kohli", 0)+77);
         h.put("hardik",h.getOrDefault("hardik",0)+12);
         h.put("gill",h.getOrDefault("gill", 0)+34);
      
       
         
         for(Map.Entry<String,Integer> entry:h.entrySet()) {
       	  System.out.println(entry.getKey()+":"+entry.getValue());
         }

	}

}
