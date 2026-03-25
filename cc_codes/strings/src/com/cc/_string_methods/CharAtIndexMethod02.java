package com.cc._string_methods;

public class CharAtIndexMethod02 {

	public static void main(String[] args) {

		//02====>public char charAt(int index)		
		
		String s = new String("Java");
		char c = s.charAt(3);
		System.out.println(c);
//		a
				
		char c1 = s.charAt(10);
		System.out.println(c1);
			
//		Exception : java.lang.StringIndexOutOfBoundsException
			
		char c2 = s.charAt(-10);
		System.out.println(c2);
		
//		Exception java.lang.StringIndexOutOfBoundsException
	}

}
