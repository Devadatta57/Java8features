package com.setsequalandhashcode;

public class Faculty {
	private int id;
	private String name;
	private int age;
	public Faculty(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		else if(obj==null) {
			return false;
		}
		else if(this.getClass()!=obj.getClass()) {
			return false;
		}
		else {
		   Faculty faculty=(Faculty)obj;
		   if((this.id==faculty.id) && (this.name==faculty.name) &&(this.age==faculty.age)) {
			   return true;
		   }
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		int hash=13;
	     hash=hash*17+id;
	     hash=hash*17+name.hashCode();
	     hash=hash*17+age;
	     return hash;                                     
		
	}

}
