package com.cc._method_overloading;
public class Scenario6 {

	public void m1(Employee emp) {
		System.out.println("Employee Parameter");
	}
	public void m1(Developer dev) {
		System.out.println("Developer Parameter");
	}
	public static void main(String[] args) {
		
		Scenario6 s = new Scenario6();
		
		Employee emp = new Employee();
		s.m1(emp);
		
		Developer dev = new Developer();
		s.m1(dev);
		
		Employee empDev = new Developer();
		s.m1(empDev);
	}

}


/*
Employee Parameter
Developer Parameter
Employee Parameter
*/