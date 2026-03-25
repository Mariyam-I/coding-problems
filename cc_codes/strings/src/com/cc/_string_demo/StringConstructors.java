package com.cc._string_demo;

public class StringConstructors {

	public static void main(String[] args) {

		String s1 = new String();  //Not Recommended
		String s2 = new String("Java");
		String s3 = new String(new StringBuffer("Java"));
		String s4 = new String(new StringBuilder("Java"));
		String s5 = new String(new char[] {'J','a','v','a'});
		String s6 = new String(new byte[] {65,66,67,68,69});
		
		System.out.println("s1 = " +s1);
		System.out.println("s2 = " +s2);
		System.out.println("s3 = " +s3);
		System.out.println("s4 = " +s4);
		System.out.println("s5 = " +s5);
		System.out.println("s6 = " +s6);
	}

}


/*
s1 = 
s2 = Java
s3 = Java
s4 = Java
s5 = Java
s6 = ABCDE
*/