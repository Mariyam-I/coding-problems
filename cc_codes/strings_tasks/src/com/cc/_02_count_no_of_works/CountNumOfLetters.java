package com.cc._02_count_no_of_works;

public class CountNumOfLetters {

	public static void main(String[] args) {

		String s = "Welcome to club coder";
		char[] crr = s.toCharArray();

		int lettersNum = CountLetters(crr);

		System.out.println("Number of Letters in given String is : " + lettersNum);
	}

	public static int CountLetters(char[] crr) {

		int letterCount = 0;
		for (int i = 0; i < crr.length; i++) {
			if (crr[i] != 32) {                           //32 is unicode of space 
				letterCount++;
			}
		}
		return letterCount;
	}

}






//Number of Letters in given String is : 18           -------> OutPut
