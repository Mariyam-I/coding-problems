package com.cc._6_abstract_modifier;

public class Car extends Vehicle{
	
	public int getNumberOfWheels() {
		return 5;
	}
	
	void m1() {}
	void m2() {}
//	Error ---> The type Car must implement the inherited abstract method Vehicle.m2()
	 
//	void m2();  Error ---> This method requires a body instead of a semicolon

	
}
