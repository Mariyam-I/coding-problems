package com.cc._method_overloading;

public class Test {

	/*public void m1() {
		System.out.println("m1()");
	}
	public void m1(int i) {
		System.out.println("m1(int)");
	}
	public void m1(double d) {
		System.out.println("m1(double)");
	}*/
	
	public void m1(int i) {
		System.out.println("m1(int)");
	}
	public void m1(String s) {
		System.out.println("m1(String)");
	}
	public static void main(String[] args) {

		Test t = new Test();
		/*t.m1();
		t.m1(10);
		t.m1(10.50);*/
		
		t.m1(10);
		t.m1("Java");
//		t.m3(10.5);     The method m3(double) is undefined for the type Test
	}

}
