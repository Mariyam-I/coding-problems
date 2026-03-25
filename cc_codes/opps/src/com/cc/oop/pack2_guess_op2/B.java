package com.cc.oop.pack2_guess_op2;

import com.cc.oop.pack1_guess_op1.A;

public class B extends A{

	public static void main(String... args) {

/*		A a = new A(); without extending 
		a.m1();
*/
		
		A a = new A();
		a.m1();
		
		B b = new B();
		b.m1();
		
		A a1 = new B();
		a1.m1();
		 
	}
}
