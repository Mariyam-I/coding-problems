package com.cc._numbers_patterns;

public class NumPattern8 {

	public static void main(String[] args) {

		int rows = 5 , columns = 5 ;
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j <= columns ; j++) {
				if(j >= i) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}


/*
12345
 2345
  345
   45
    5
*/