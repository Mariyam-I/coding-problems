package com.cc._5_constructors;

public class Employee extends Persons {
	String name = "Chintamani";

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.getDetails();	
		
	}

	public void getDetails() {
	
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}

}

/*
Chintamani
Chintamani
Chintu
*/