package com.cc._method_overloading;

public class Scenario5 {

	public void m1(int i, float f) {
		System.out.println("int-float Parameter");
	}
	public void m1(float f, int i) {
		System.out.println("float-int Parameter");
	}
	public static void main(String[] args) {

		Scenario5 s = new Scenario5();
		s.m1(10, 10.5F);
		s.m1(10.5f, 10);
//		s.m1(10, 10);   The method m1(int, float) is ambiguous for the type Scenario5
//		s.m1(10.5f, 10.5f);   The method m1(float, int) in the type Scenario5 is not applicable for the arguments (float, float)
	}

}
