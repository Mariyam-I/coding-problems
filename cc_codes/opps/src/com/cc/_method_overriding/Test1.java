package com.cc._method_overriding;

public class Test1 {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.marr();
		
		Child c = new Child();
		c.marr();
		
		Parent p1 = new Child();
		p1.marr();
	
		/*
		Parent : Shantamma
		Child : Senorita
		Child : Senorita
		*/
	
		
//		Rules of OverRiding
		
		Parent p2 = new Parent();
//		p2.m3();  The method m3() from the type Parent is not visible
		
		Child c1 = new Child();
//		c1.m3();  The method m3() from the type Child is not visible
		
		Parent p3 = new Child();
//		p3.m3();  The method m3() from the type Parent is not visible
	
	
	
		Parent p4 = new Parent();
		p4.m9();
		
		Child c2 = new Child();
		c2.m9();
		
		Parent p5 = new Child();
		p5.m9();
	
		/*Parent : m9()
		Child : m9()
		Parent : m9()
*/
	}

}
