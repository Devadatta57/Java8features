package com.lists;

import java.util.Stack;

public class StackExample {
    public static void main(String args[]) {
    	Stack<Integer> s=new Stack<Integer>();
    	s.push(34);
    	s.push(23);
    	s.push(67);
    	s.push(89);
    	System.out.println(s);
    	System.out.println(s.pop());
    	System.out.println(s);
    	System.out.println(s.peek());
    	System.out.println(s);
    	System.out.println(s.search(34));
    	System.out.println(s.empty());
        System.out.println(s.contains(12));
        System.out.println(s.add(23));
        System.out.println(s);
        System.out.println(s.size());
    }

}
