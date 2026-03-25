package com.cc._string_methods;

public class LastIndexOfMethod10 {

	public static void main(String[] args) {

//								10====>public int lastIndexOf(int ch)
		String s = "Java";
		System.out.println(s.lastIndexOf("a"));
		
//		3
		
		String s1 = "Java Programming";
		System.out.println(s1.lastIndexOf("a"));
		
//		10
		
//		public int lastIndexOf(int ch, int fromIndex)
		
		System.out.println(s1.lastIndexOf("a", 9));
		
//		3
	}

}
