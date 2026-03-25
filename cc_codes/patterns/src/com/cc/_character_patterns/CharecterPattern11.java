package com.cc._character_patterns;

public class CharecterPattern11 {

	public static void main(String[] args) {

		int rows = 5 , columns = 5 ;
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j <= columns ; j++) {
				if(j >=(6-i)) {
					System.out.print((char)(70-i));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}


/*
    E
   DD
  CCC
 BBBB
AAAAA
*/