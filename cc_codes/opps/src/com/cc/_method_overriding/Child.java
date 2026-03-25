package com.cc._method_overriding;

public class Child extends Parent{

	public void marr() {
		System.out.println("Child : Senorita");
	}

	
				//OverRiding Rules 
	
	
	/*1 ---> 	Method signature same
			Class Different */
	
	@Override
	public void m1() {
		System.out.println("Child : m1()");
	}


	/*2 ---> Return type must be same
	Covariant also allowed*/
	
	@Override
	public String m2() {
		System.out.println("Child : m2()");
		return null;
	}
	
	
//	3
	
	private void m3() {
		System.out.println("Child : m3()");
	}
	
//	4
	
	/*public void m4() {
//		Cannot override the final method from Parent
		System.out.println("Child : m4()");
	}
	*/
	
	
	
	/*public final void m5() {
//		Cannot override the final method from Parent
		System.out.println("Child : m5()");
	}*/


	
//  5
	
	
	/*@Override
	protected void m6() {
//		Cannot reduce the visibility of the inherited method from Parent
		System.out.println("Child : m6()");
	}
*/
	
//	  6
	
	/*public void m7() {
//		This instance method cannot override the static method from Parent
		System.out.println("Child : m7()");
	}*/

	

	/*@Override
	public static void m8() {
//		The method m8() of type Child must override or implement a supertype method
		System.out.println("Child : m8()");
	}*/
	
	
	
	
	public static void m9() {
		System.out.println("Child : m9()");
	}
}
