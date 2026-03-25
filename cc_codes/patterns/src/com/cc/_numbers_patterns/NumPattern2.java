package com.cc._numbers_patterns;

public class NumPattern2 {

	public static void main(String[] args) {
		
		int rows = 5 , columns = 5 ;
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j <= columns ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}


/*
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
*/