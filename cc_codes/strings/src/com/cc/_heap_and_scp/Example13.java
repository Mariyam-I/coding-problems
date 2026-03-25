package com.cc._heap_and_scp;

public class Example13 {

	public static void main(String[] args) {

		String s1 = "Club" + new String(" Coder");
		String s2 = s1.intern();
		String s3 = "Club Coder";
		
		System.out.println(s1 == s3);     //true
		
		System.out.println(s2 == s3);     //true

	}

}
