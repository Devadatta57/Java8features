package com.features;

import java.util.ArrayList;

public class StudentExample {
	public static void main(String[] args) {
      ArrayList<Student> s=new ArrayList<Student>();
      s.add(new Student(71,"deva",34,21000,"hyderabad"));
      s.add(new Student(12,"eva",4,71000,"chennai"));
      s.add(new Student(11,"reva",84,81000,"vijayawada"));
      s.add(new Student(91,"peva",94,71000,"banglore"));
      s.add(new Student(71,"ieva",34,25000,"hyderabad"));
      s.add(new Student(52,"leva",4,77000,"chennai"));
      s.add(new Student(71,"geva",54,88000,"vijayawada"));
      s.add(new Student(81,"meva",24,70000,"banglore"));
      
//     long d= s.stream().filter(value->value.getAge()>=20).count();
//     System.out.println(d);
//     s.stream().filter(value->value.getAge()>50).forEach(value->System.out.println(value));
   //  s.stream().map(value->value.getLocation()).distinct().forEach(value->System.out.println(value));
   //6  s.stream().map(value->value.getName().toUpperCase()).distinct().forEach(value->System.out.println(value));
     // s.stream().filter(value->value.getLocation().equals("hyderabad")).filter(value->value.getAge()>=50).forEach(value->System.out.println(value));
	s.stream()
	.filter(value->value.getLocation().equals("hyderabad"))
	.filter(value->value.getAge()>=20)
	.map(value->{value.setSalary(value.getSalary()+(value.getSalary()*0.2));
	return value;})
	.forEach(value->System.out.println(value));
	
	}
}
