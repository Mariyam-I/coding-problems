package com.cc._string_methods;

public class ConcatinationMethod01 {

	public static void main(String[] args) {
	
								//01====>public String concat(String str);
		String s1 = new String("Java");
		s1 = s1.concat(" Language");
		System.out.println(s1);
		
//		Java Language
		
		String s2 = new String("Java");
		s2.concat(" Language");
		System.out.println(s2); 
		
//		Java
		
		
/*s = s + "Language"
s += "Language"*/
					
	}

}
