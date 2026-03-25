package com.cc._12_no_of_vowels_consonants;

public class NumOfVowelsConsonants {

	public static void main(String[] args) {

//		String s = "I am Learning Java";
		String s = "Hello my self Mariyam Inamdar and , i am learning java";
		char[] srr = s.toCharArray();
		
		vcCount(s,srr);
	}

	public static void vcCount(String s, char[] srr) {
		int vCount = 0, cCount = 0;
	
		for(int i = 0 ; i < srr.length ; i++) {
			if(srr[i] == 'a' || srr[i] == 'e' || srr[i] == 'i' || srr[i] == 'o' || srr[i] == 'u' || 
			   srr[i] == 'A' || srr[i] == 'E' || srr[i] == 'I' || srr[i] == 'O' || srr[i] == 'U' ) {
				
				vCount++;
			
			} else {
				if(srr[i] == 32) 
					cCount--;
				cCount++;
			}
		}
		System.out.println("Number of Vowels = " +vCount);
		System.out.println("Number of Consonants = " +cCount);
			
	}

}

/*
Number of Vowels = 7
Number of Consonants = 8



Number of Vowels = 17
Number of Consonants = 27


*/
