package com.cc._09_anagram_panagram;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "listen";
		String s2 = "silent";
		
		boolean equal = isAnagram(s1,s2);
		
		if(equal == true) {
			System.out.println("Is Anagram");
		} else {
			System.out.println("Not Anagram");
		}
		
	}
	

	public static boolean isAnagram(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		s1.toLowerCase();
		s2.toLowerCase();
		
		char[] crr1 = s1.toCharArray();
		char[] crr2 = s2.toCharArray();
		
		crr1 = bubbleSort(crr1);
		crr2 = bubbleSort(crr2);
		
		for(int i = 0 ; i < crr1.length ; i++) {
			if(crr1[i] != crr2[i]) {
				return false;
			}
		}
		return true;
	}


	public static char[] bubbleSort(char[] crr) {
		
		for(int j = 0 ; j < crr.length-1 ; j++) {
			int count = 0;
			for(int i = 0 ; i < crr.length-1-j ; i++) {
				if(crr[i] > crr[i+1]) {
					crr[i] = (char) (crr[i] + crr[i+1]);
					crr[i+1] = (char) (crr[i] - crr[i+1]);
					crr[i] = (char) (crr[i] - crr[i+1]);
					count++;
				}
			}
			if(count == 0) {
				break;
			}
		}
		return crr;
	}
}


//Is Anagram