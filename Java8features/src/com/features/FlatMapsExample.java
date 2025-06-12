package com.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FlatMapsExample {

	public static void main(String[] args) {
	List<List<Integer>> l=new ArrayList<List<Integer>>();
	
	l.add(Arrays.asList(12,34,56,5));
	l.add(Arrays.asList(12,34,56,554));
	l.add(Arrays.asList(67,344,232,12312));
	
	System.out.println(l);
	//l.stream().flatMap(i->i.stream()).distinct().forEach(i->System.out.print(i+" "));

		Set<Integer> p=l.stream().flatMap(i->i.stream()).collect(Collectors.toSet());
		System.out.println(new TreeSet<Integer>(p));


	}
}
