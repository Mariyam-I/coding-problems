package com.cc._start_patterns;

public class StarPattern14 {

	public static void main(String[] args) {

		int rows = 4 , columns = 7 ;
		
		for(int i = 1 ; i <= rows ; i++) {
			boolean flag = true ;
			
			for(int j = 1 ; j <= columns ; j++) {
					
				if((i+j) >= 5 && (j-i) <= 3 && flag == true) {
					
//					if((i+j) % 2 != 0)
//					if((i+j) % 2 == 0)
						System.out.print("*");	
						flag = false ;
//					else
//						System.out.print(" ");
				}
				else {
					System.out.print(" ");
					flag = true ;
				}
			}	
			
			System.out.println();
		}

	}

}


/*      if((i+j) % 2 != 0)
   *   
  * *  
 * * * 
* * * *
*/


/*      if((i+j) % 2 == 0)
   *   
  * *  
 * * * 
* * * *
*/



/*
   *   
  * *  
 * * * 
* * * *
*/