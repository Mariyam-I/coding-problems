package com.cc._string_methods;

public class EqualsMethod03 {

	public static void main(String[] args) {
		
		//03====>public boolean equals(Object obj)
		
		String s1 = new String("Java");
		String s2 = new String("JAVA");
		System.out.println(s1.equals(s2));
		
//		false

		//03====>public boolean equalsIgnoreCase(Object obj)
		System.out.println(s1.equalsIgnoreCase(s2));
		
//		true
		

		
/*Content Comparison

equals = case sensitive
equalsIgnoreCase = ignore case

*/
		
	}

}
