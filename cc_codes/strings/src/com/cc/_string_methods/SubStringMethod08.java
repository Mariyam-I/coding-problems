package com.cc._string_methods;

public class SubStringMethod08 {

	public static void main(String[] args) {

//								08====>public String subString(int beginIndex)
		
		String s = "Java Programming";
		System.out.println(s.substring(5));
		
//		Programming
		
/*								substring(beginIndex, endIndex)
		beginIndex --->inclusive
		endIndex   --->exclusive*/
		
		String s1 = "Programming";
		System.out.println(s1.substring(0, 7));
		
//		Program
	}

}
