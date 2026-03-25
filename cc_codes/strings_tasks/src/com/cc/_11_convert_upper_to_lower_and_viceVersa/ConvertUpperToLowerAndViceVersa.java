package com.cc._11_convert_upper_to_lower_and_viceVersa;

public class ConvertUpperToLowerAndViceVersa {

	public static void main(String[] args) {
		
		String s = "JaVa Is FuN";
		
		char[] crr = s.toCharArray();
		
		String s1 = convertCharcter(s,crr);
		System.out.print(s1);
		
	}

	public static String convertCharcter(String s , char[] crr) {
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0 ; i < crr.length ; i++) {
			
			if(crr[i] >= 65 && crr[i] <= 90 && crr[i] != 32) {
				crr[i] = (char)(crr[i] + 32);
			} else if(crr[i] >= 97 && crr[i] <= 122 && crr[i] != 32) {
				crr[i] = (char)(crr[i] - 32);
			}
		}
		
		for(int i = 0 ; i < crr.length ; i++) {
			sb.append(crr[i]);
		}
		return sb.toString();
	}
}


//jAvA iS fUn

