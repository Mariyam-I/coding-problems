package com.cc._method_overloading;

public class Scenario1 {

	public void m1(int i) {
		System.out.println("Integral Parameter");
	}
	public void m1(float f) {
		System.out.println("Float Parameter");
	}
	public static void main(String[] args) {

		Scenario1 s = new Scenario1();
		s.m1(10);
		s.m1(10.5F);
//		s.m1(10.5);       //The method m1(int) in the type Scenario1 is not applicable for the arguments (double)
		s.m1('a');
		s.m1(100L);
	}

}
