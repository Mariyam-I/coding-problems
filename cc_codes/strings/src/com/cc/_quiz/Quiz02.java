package com.cc._quiz;

public class Quiz02 {

	public static void main(String[] args) {

		String s1 = new String("Java");
		String s2 = s1.toString();
		String s3 = s1.toLowerCase();
		String s4 = s1.toUpperCase();
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s1 == s4);
		
		
/*
true
false
false
*/
	}

}
