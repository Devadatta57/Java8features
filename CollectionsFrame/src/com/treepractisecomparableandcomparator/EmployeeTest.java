package com.treepractisecomparableandcomparator;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		TreeSet<Employee> t=new TreeSet<Employee>();
		t.add(new Employee(21,"deva",24));
		t.add(new Employee(14,"eva",94));
		t.add(new Employee(34,"heva",64));
		t.add(new Employee(90,"peva",44));
		
		Iterator s=t.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}

	}

}
