package com.cc._method_overloading;

public class Scenario3 {

	public void m1(String s) {
		System.out.println("String Parameter");
	}
	public void m1(StringBuffer sb) {
		System.out.println("String Buffer Parameter");
	}
	public static void main(String[] args) {

		Scenario3 s = new Scenario3();
		s.m1(new String("Java"));
		s.m1(new StringBuffer("Java"));
//		s.m1(null);   //The method m1(String) is ambiguous for the type Scenario3
	}

}
