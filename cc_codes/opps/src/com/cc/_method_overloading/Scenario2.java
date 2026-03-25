package com.cc._method_overloading;

public class Scenario2 {

	public void m1(Object obj) {
		System.out.println("Object Parameter");
	}
	public void m1(String s) {
		System.out.println("String parameter");
	}
	public static void main(String[] args) {

		Scenario2 s = new Scenario2();
		s.m1(new Object());
		s.m1(new String("java"));
		s.m1("Java");
		s.m1(null);    //String Object as it is child of Object class
	}

}
