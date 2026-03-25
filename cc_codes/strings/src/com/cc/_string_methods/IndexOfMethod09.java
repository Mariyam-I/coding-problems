package com.cc._string_methods;

public class IndexOfMethod09 {

	public static void main(String[] args) {

//								09====>public int indexOf(int ch)
		String s = "Java";
		System.out.println(s.indexOf('a'));
		
//		1
		
		System.out.println(s.indexOf('b'));
		
//		-1
		
//		public int indexOf(ch, fromIndex)
		String s2 = "Java Programming";
		System.out.println(s2.indexOf('a', 5));
	
//		10
	
	}

}
