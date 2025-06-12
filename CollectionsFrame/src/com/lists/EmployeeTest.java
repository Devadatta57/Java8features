package com.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		
		ArrayList<Employee> t=new ArrayList<Employee>();
		t.add(new Employee(13, "deva", 12,66));
		t.add(new Employee(53, "eva", 52,96));
		t.add(new Employee(73, "ieva", 22,56));
		t.add(new Employee(63, "peva", 72,26));
		
		Collections.sort(t,new IdComparator());
		
		//System.out.println(t);
		 Iterator s=t.iterator();
		 while(s.hasNext()) {
			System.out.println(s.next());
			 
		 }

		
	}
}
