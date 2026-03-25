package com.cc._16_password_checker;

public class PasswordChecker {

	public static void main(String[] args) {

//		String password = "@#$Mariyam97293";
		String password = "Ma25bna32v";
		
		boolean valid = isValid(password);
		
		if(valid == true) {
			System.out.println(password + ": Is valid.");
		}
		else {
			System.out.println(password + " : Is Not valid.");
		}
	}

	public static boolean isValid(String password) {
		
		if(password.length() < 8) {
			return false;
		}
		boolean digit = false, uppercase = false, lowercase = false, specialchar = false;
		
		char[] crr = password.toCharArray();
		
		for(int i = 0 ; i < crr.length ; i++) {
			
			if(crr[i] <= 48 && crr[i] >= 57 && !digit) {
				return digit = true;
			}
			if(crr[i] <= 65 && crr[i] >= 90 && !uppercase) {
				return uppercase = true;
			}
			if(crr[i] <= 97 && crr[i] >= 122 && !lowercase) {
				return lowercase = true;
			}
			if((crr[i] <= 33 && crr[i] >= 47) || crr[i] == 64) {    //64 [@]   // [ ! " # $ % & ' ( ) \* + , - . /. ]
				return specialchar = true;
			}
		}
		
		if(digit == true && uppercase == true && lowercase == true && specialchar == true) {
			return true;
		} else {
			return false;
		}
	}
}




//@#$Mariyam97293: Is valid.
//Ma2# : Is Not valid.

