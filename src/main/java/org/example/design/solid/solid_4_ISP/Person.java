package org.example.design.solid.solid_4_ISP;


public class Person {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String ageGroup) {
		this.name = ageGroup;
	}
	public Person(int age, String ageGroup) {
		super();
		this.age = age;
		this.name = ageGroup;
	}
}
