package com.cc._07_merge_two_array_without_using_method;

public class MergeTwoStringWithoutMethods {

	public static void main(String[] args) {

		String s1 = "Club";       //It is working only if 1st string contains one less char than 2nd string  
		String s2 = "Coder";
		
		String s3 = stringAfterMerging(s1,s2);
		
		System.out.println("String After Merging : "+s3);
	}

	public static String stringAfterMerging(String s1, String s2) {
		
		char[] crr1 = s1.toCharArray(); 
		char[] crr2 = s2.toCharArray(); 
		
		char[] crr = mergeArray(crr1, crr2);
		
		StringBuffer sb = new StringBuffer();
		sb.append(crr);
		
		return sb.toString();
	}

	public static char[] mergeArray(char[] crr1, char[] crr2) {

		char[] crr = new char[crr1.length + crr2.length];
		
		for(int i = 0 ; i < crr1.length ; i++) {
			crr[i] = crr1[i];
		}
		
		for(int i = crr1.length + 1 ; i < crr.length ; i++) {
			crr[i] = crr2[i - crr2.length]; 
		}
		return crr;
	}
}


//String After Merging : Club Coder
