package com.cc._string_methods;

public class ReplaceMethod07 {

	public static void main(String[] args) {

//								07====>public String replace(char OlderChar , char Newrchar)
		
		String s = new String("Java");
		System.out.println(s.replace('a', 'A'));
		
//		JAvA
		
		String s1 = new String("Java");
		System.out.println(s1.replace('b', 'A'));
		
//		Java
	}

}
