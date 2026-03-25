package com.cc._string_methods;

public class FinalVsImmutable {

	public static void main(String[] args) {

		final StringBuffer sb = new StringBuffer("Java");
		sb.append(" is interesting");
		
		System.out.println(sb);      //Java is interesting

		
		
		final StringBuffer sb1 = new StringBuffer("   Java");
		sb1.append(" is interesting");
		System.out.println(sb1);
		
//		sb1 = new StringBuffer("Java is exciting");
		
		
//		The final local variable sb1 cannot be assigned. It must be blank and not using a compound assignment
	}

}
