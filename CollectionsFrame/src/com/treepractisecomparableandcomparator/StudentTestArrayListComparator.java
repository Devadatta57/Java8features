package com.treepractisecomparableandcomparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentTestArrayListComparator {
	public static void main(String[] args) {
		ArrayList<Student> t=new ArrayList<Student>();
		t.add(new Student(21,"deva",24));
		t.add(new Student(14,"eva",94));
		t.add(new Student(34,"heva",64));
		t.add(new Student(90,"peva",44));
		
		Collections.sort(t,new NameComparator());
		
		Iterator s=t.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}

	}


}
