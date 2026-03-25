package com.cc._06_check_for_empty_string;

public class CheckForEmptyString {

	public static void main(String[] args) {

//		String s = "";
		String s = " ";
		
		boolean s1 = isEmptyString(s);
		
		if(s1 == true) {
			System.out.println("Given String is Empty");
		} else {
			System.out.println("Given String is Not Empty");
		}
		
	}

	public static boolean isEmptyString(String s) {
	
		if(s.isEmpty() == true) {
			return true;
		} else{
			return false;
		}
	}

}


//Given String is Empty

//Given String is Not Empty

