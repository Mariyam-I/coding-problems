package com.cc._numbers_patterns;

public class NumPattern14 {

	public static void main(String[] args) {

		int rows = 5 , columns = 5 ;
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j <= columns ; j++) {
				if(j >=(6-i)) {
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
    5
   45
  345
 2345
12345
*/