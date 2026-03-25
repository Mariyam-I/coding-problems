package com.cc._09_anagram_panagram;

public class Panagram {

	public static void main(String[] args) {
		
		String s = "The Quick Brown fox jumps over the lazy dog";
//		String s = " ";
		
		boolean panagram = isPanagram(s);
		
		if(panagram == true) {
			System.out.println("Given String is Panagram");
		} else {
			System.out.println("Given String is not Panagram");
		}
	}

	public static boolean isPanagram(String s) {
		
		if(s.length() < 26) {
			return false;
		}
		
		s = s.toLowerCase();
		
		for(char ch = 'a' ; ch <= 'z' ; ch++) {
			if(s.indexOf(ch) == -1) {                //Check if any character is missing 
				return false;
			}
		}
		return true;
	}	
}


//Given String is Panagram