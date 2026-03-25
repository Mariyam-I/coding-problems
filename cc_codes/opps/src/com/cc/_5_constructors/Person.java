package com.cc._5_constructors;

public class Person {

	String name;
	int age;
	
	/*public Person() {
		System.out.println("Person no-arg constructor called");
	}*/
	
	
	//Parameterized constructor 
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		/*Person p1 = new Person();
		Person p2 = new Person();		*/
		
		
		/*==Person p1 = new Person();
		Person p2 = new Person();
		Error : The constructor Person() is undefined*/
		
		/*Person p1 = new Person("Ram" , 22);
		Person p2 = new Person("Shyam" , 24);*/
		
	}
}

/*
Person no-arg constructor called
Person no-arg constructor called
*/