package com.maps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
       HashMap<Integer,String> h=new HashMap<Integer,String>();
       h.put(101,"deva");
       h.put(105,"datta");
       h.put(89,"poit");
       h.put(12,"fair");
       h.put(12,"sdad");
       h.put(null, "dedasd");
       h.put(null, "adns");
       
    //   System.out.println(h);
//     System.out.println(h.keySet());
//     System.out.println(h.values());
//     System.out.println(h.get(101));
//     System.out.println(h.get(901));
//     System.out.println(h.containsKey(102));
//     System.out.println(h.containsValue("deva"));
    h.replace(89,"raw");
    System.out.println(h.get(89));
    
    for(Map.Entry<Integer,String> entry:h.entrySet()) {
       System.out.println(entry.getKey()+":"+entry.getValue());
    }
}
}
