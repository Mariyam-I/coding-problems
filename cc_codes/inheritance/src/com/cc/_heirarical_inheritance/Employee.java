package com.cc._heirarical_inheritance;

public class Employee {

	private String name;
	private int age;
	private String gender;
	private double salary;


	//Getter Setter for Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Getter Setter for Age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Getter Setter for Gender
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//Getter Setter for salary
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Behaviors
	public void work() {
		System.out.println(".....Doing work");
	}
	public void takeBreak() {
		System.out.println(".....Break time started");
	}
	
}
