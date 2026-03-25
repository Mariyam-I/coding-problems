package com.cc._string_methods;

public class InternMethod14 {

	public static void main(String[] args) {
	
//							14====>public String intern()
		
//		String - Immutable
		
		
		String s = new String("Java");
		s = s.concat(" Language");
		
		String s1 = s.intern();
		String s2 = "Java Language";
		
		System.out.println(s1 == s2);           //true
	
		System.out.println(s1.equals(s2));      //true
		
		System.out.println(s.equals(s1));   	//true
		
		System.out.println(s.equals(s2)); 		//true
		}
}
