package com.cc._numbers_patterns;

public class NumPattern12 {

	public static void main(String[] args) {

		int rows = 5 , columns = 5 ;
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j <= columns ; j++) {
				if(j >=(6-i)) {
					System.out.print(6-j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}


/*
    1
   21
  321
 4321
54321
*/