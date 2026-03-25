package com.cc._start_patterns;

public class StarPattern2 {

	public static void main(String[] args) {

		int rows = 5 , columns = 5 ;
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j <= columns ; j++) {
				if(j <= i) {
					System.out.print("*  ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}


/*
*      
*  *     
*  *  *    
*  *  *  *   
*  *  *  *  *  
*/
