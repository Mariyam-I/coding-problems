package com.cc._start_patterns;

public class StarPattern9 {

	public static void main(String[] args) {

		int rows = 5 , columns = 9 ;
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j <= columns ; j++) {
					
				if(j <= i || (i+j) >= 10)
					System.out.print("*");	
				else
					System.out.print(" ");
			}	
			
			System.out.println();
		}
	}
}


/*
*       *
**     **
***   ***
**** ****
*********
*/