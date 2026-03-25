package com.cc._character_patterns;

public class CharecterPattern6 {

	public static void main(String[] args) {

		int rows = 5 , columns = 5 ;
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j <= columns ; j++) {
				if(j >= i) {
					System.out.print((char)(64+j));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}


/*
ABCDE
 BCDE
  CDE
   DE
    E
 */