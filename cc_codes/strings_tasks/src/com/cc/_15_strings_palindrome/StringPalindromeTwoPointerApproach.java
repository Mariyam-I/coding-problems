package com.cc._15_strings_palindrome;

public class StringPalindromeTwoPointerApproach {

	public static void main(String[] args) {

//		String str = "CIVIC";
		String str = "abc";
		
		char[] crr = str.toCharArray();
		
		boolean palindrome = isPalindrome(str, crr);
		
		if(palindrome == true) {
			System.out.println("Is Palindrome");
		} else {
			System.out.println("Is Not Palindrome");
		}
	}

	public static boolean isPalindrome(String str, char[] crr) {
		int l = 0, r = crr.length - 1;
		
		while(l <= r) {
			if(crr[l] != crr[r]) {
				return false;
			} else {
				l++;
				r--;
			}
		}
		return true;
	}

}


//Is Palindrome



//Is Not Palindrome
