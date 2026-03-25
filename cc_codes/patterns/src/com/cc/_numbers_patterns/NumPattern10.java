package com.cc._numbers_patterns;

public class NumPattern10 {

	public static void main(String[] args) {

		int rows = 5 , columns = 5 ;
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j <= columns ; j++) {
				if(j >= i) {
					System.out.print((6-j));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}



/*
54321
 4321
  321
   21
    1
 */