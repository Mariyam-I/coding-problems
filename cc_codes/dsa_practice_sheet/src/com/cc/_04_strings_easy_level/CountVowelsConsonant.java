package com.cc._04_strings_easy_level;

public class CountVowelsConsonant {

	public static void main(String[] args) {

		String s = "Hello World";
		s = s.toLowerCase();
		
		countVC(s);
	}

	private static void countVC(String s) {

		char[] crr = s.toCharArray();
		int vCount = 0, cCount = 0;
		
		for(int i = 0; i < crr.length; i++) {
			if(crr[i] == 'a' || crr[i] == 'e' || crr[i] == 'i' || crr[i] == 'o' || crr[i] == 'u') {
				vCount++;
			} else {
				if(crr[i] == 32) {
					cCount--;
				}
				cCount++;
			}
		}
		
		System.out.println("Vowels : " + vCount);
		System.out.println("Consonants : " + cCount);
			
	
	}

}

/*
Vowels : 3
Consonants : 7
*/
