package com.cc._8_private;

public class C extends P{

	public static void main(String[] args) {

		P p1 = new P();
		p1.m1();
		
		C c1 = new C();
		c1.m1();
		
		P p2 = new C();
		p2.m1();
	}

}
