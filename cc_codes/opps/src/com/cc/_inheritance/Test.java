package com.cc._inheritance;

public class Test {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.m1();
//		p.m2(); The method m2() is undefined for the type Parent
		
		
		Child c = new Child();
		c.m1();
		c.m2();
		
		
		Parent p1 = new Child();
		p1.m1();
//		p1.m2(); //The method m2() is undefined for the type Parent
		//pg no. 14
		
		
		/*Child c1 = new Parent();  //Type mismatch: cannot convert from Parent to Child
		c1.m1();
		c1.m2();*/
		
	}

}
