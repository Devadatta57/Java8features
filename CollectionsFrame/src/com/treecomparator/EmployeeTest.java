package com.treecomparator;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		
		TreeSet<Employee> t=new TreeSet<Employee>(new NameComparator());
		t.add(new Employee(13, "deva", 12,66));
		t.add(new Employee(53, "eva", 52,96));
		t.add(new Employee(73, "ieva", 22,56));
		t.add(new Employee(63, "peva", 72,26));
		
		 Iterator s=t.iterator();
		 while(s.hasNext()) {
			System.out.println(s.next());
			 
		 }

		
	}
}
