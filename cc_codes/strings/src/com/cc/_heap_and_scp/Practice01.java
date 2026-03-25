package com.cc._heap_and_scp;

public class Practice01 {

	public static void main(String[] args) {

		String s1 = new String("Java");
		
		String s2 = s1.intern();
		System.out.println(s1 == s2);         //fslse
		
		String s3 = "Java";
		System.out.println(s2 == s3);         //true
		
		String s4 = s1.concat(" Language");
		String s5 = s4.intern();
		
		String s6 = "Java Language";
		
		System.out.println(s4 == s5);          //true
		System.out.println(s5 == s6);          //true
	}

}
