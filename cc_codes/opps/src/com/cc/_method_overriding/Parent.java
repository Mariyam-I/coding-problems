package com.cc._method_overriding;

public class Parent {
	
	public void property() {
		System.out.println("Land + Gold + Ca$h");
	}
	public void marr() {
		System.out.println("Parent : Shantamma");
	}
	
	
					//OverRiding Rules 
	
	/* 1 ---> Method signature same
	 Class Different */
	 
	public void m1() {
		System.out.println("Parent : m1()");
	}
	
	
	/*2 ---> Return type must be same
				Covariant also allowed*/
	
	public Object m2() {
		System.out.println("Parent : m2()");
		return null;
	}
	
	
//	3
	
	private void m3() {
		System.out.println("Parent : m3()");
	}
	
	
//	4
	
	public final void m4() {
		System.out.println("Parent : m4()");
	}

	
	
	public final void m5() {
		System.out.println("Parent : m5()");
	}
	
	
//	5
	
	public void m6() {
		System.out.println("Parent : m6()");
	}
	
	
	
//	6
	
	public static void m7() {
		System.out.println("Parent : m7()");
	}
	
	
	public void m8() {
		System.out.println("Parent : m8()");
	}



	public static void m9() {
		System.out.println("Parent : m9()");
	}
}
