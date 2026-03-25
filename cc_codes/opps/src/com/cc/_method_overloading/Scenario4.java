package com.cc._method_overloading;

public class Scenario4 {

	public void m1(int i) {
		System.out.println("Primitive Parameter");
	}
	public void m1(int... i) {
		System.out.println("Var-arg Parameter");
	}
	public static void main(String[] args) {

		Scenario4 s = new Scenario4();
		s.m1();
		s.m1(10, 20, 30);
		s.m1(10, 20);
		s.m1(10);   //The older version will get priority (int i) as int is coming from legacy version
	}

}
