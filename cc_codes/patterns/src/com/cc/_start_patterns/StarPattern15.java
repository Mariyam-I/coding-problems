package com.cc._start_patterns;

public class StarPattern15 {

	public static void main(String[] args) {

		int rows = 9 , columns = 5 , k = 1;
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j <= columns ; j++) {
					
//				if( (j+k) >= 6)
				if(j <= k)
					System.out.print("*");	
				else
					System.out.print(" ");
			}	
			
			System.out.println();
			
			if(i < columns) 			
				k++;
			else 				
				k--;
		}
	}

}


/*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

 
 
 
 
 
 
*    
**   
***  
**** 
*****
**** 
***  
**   
*    

*/