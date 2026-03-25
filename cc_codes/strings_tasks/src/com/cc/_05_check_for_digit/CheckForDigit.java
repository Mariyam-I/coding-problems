package com.cc._05_check_for_digit;

public class CheckForDigit {

	public static void main(String[] args) {

//		String s = "12423ABSC";
		String s = "ABSC";
//		String s = "AB4SC69826";
//		String s = "ABM435790NSC";
		
		char[] crr = s.toCharArray();
		
		boolean digit = isDigitPresent(s,crr);
		
		if(digit == true) {
			System.out.println("String contains digit");
		} else {
			System.out.println("String do not contains digit");
		}
	}

	public static boolean isDigitPresent(String s, char[] crr) {
		
		s = s.toLowerCase();
	
		for(int i = 0 ; i < crr.length ; i++) {
			if(crr[i] >= 97 && crr[i] <= 122) {
				return false;
			} else if(crr[i] >= 48 && crr[i] <= 57) {
				return true;
			}
		}
		return false;
	}

}



//String contains digit

//String do not contains digit

//String contains digit

//String contains digit







