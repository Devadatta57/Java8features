package com.lists;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int rollno;
	private int age;
	public Employee(int id, String name, int rollno, int age) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}
//	@Override
//	public int compareTo(Employee o) {
//		if(this.id>o.id) {
//			return 1;
//		}
//		else {			
//	     	return -1;
//		}
//	}
	
	@Override
	public int compareTo(Employee o) {
		return  this.name.compareTo(o.name);
	}
	
}
