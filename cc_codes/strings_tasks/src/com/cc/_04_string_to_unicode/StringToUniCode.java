package com.cc._04_string_to_unicode;

public class StringToUniCode {

	public static void main(String[] args) {

		String s = "abcd";
		char[] crr = s.toCharArray();
		
		ConvertToUniCode(s,crr);
	}

	public static void ConvertToUniCode(String s, char[] crr) {

		for(int i = 0 ; i < crr.length ; i++) {
			System.out.println ((int)(crr[i]));
		}
	}

}

/*
97
98
99
100
*/