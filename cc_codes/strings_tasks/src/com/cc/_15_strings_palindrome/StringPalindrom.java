package com.cc._15_strings_palindrome;

public class StringPalindrom {

	public static void main(String[] args) {

		String s = "CIVIC";
		char[] crr = s.toCharArray();
		
		boolean result = isPalindrome(s, crr);
		if(result == true) {
			System.out.println(s + " Is Palindrome String");
		} else {
			System.out.println(s + "Is Not Palindrome String");
		}
	}

	public static boolean isPalindrome(String s, char[] crr) {
		StringBuffer sb = new StringBuffer();
		
		for(int i = crr.length-1 ; i >= 0; i--) {
			sb.append(crr[i]);
		}
		if(s.equals(sb.toString())) {
			return true;
		} else {
			return false;
		}
	}

}


//CIVIC Is Palindrome String
