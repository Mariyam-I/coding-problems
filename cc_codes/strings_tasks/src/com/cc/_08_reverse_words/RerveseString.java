package com.cc._08_reverse_words;

public class RerveseString {

	public static void main(String[] args) {

		String s = "Hello World";
		String[] s1 = s.split(" ");
		
		String s2 = reverseString(s,s1);
		
		System.out.println("String After reversing = " + s2);
	}

	public static String reverseString(String s, String[] s1) {
	
		StringBuffer sb = new StringBuffer();
		
		for(int i = s1.length - 1 ; i >= 0 ; i--) {
			sb.append(s1[i] + " ");
		}
		return sb.toString();
	}

}


//String After reversing = World Hello 