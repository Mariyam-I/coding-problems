package com.cc._start_patterns;

public class StarPattern16 {

	public static void main(String[] args) {

		int rows = 7 , columns = rows , k = 1;
		
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j <= columns ; j++) {
					
				if( ((j+k) >= 5) && ((j-k) <= 3) )
					System.out.print("*");	
				else
					System.out.print(" ");
			}	
			
			System.out.println();
			
			if(i < ((rows+1)/2) ) 			
				k++;
			else 				
				k--;
		}
	
	}

}


/*   
   *   
  ***  
 ***** 
*******
 ***** 
  ***  
   *   
*/