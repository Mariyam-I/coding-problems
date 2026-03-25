package com.cc._6_abstract_modifier;

public abstract class Vehicle {
//	Error ---> The type Vehicle must be an abstract class to define abstract methods
	
	abstract public int getNumberOfWheels();
	
	abstract void m1();
	abstract void m2();
	
	/*abstract void m3() {
//		Error ---> Abstract methods do not specify a body
	}*/
}
