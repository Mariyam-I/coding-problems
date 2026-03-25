package com.cc._02_declare_and_initialize_array;

public class PrintingArray {

	public static void main(String[] args) {

		//Using for loop
		
		int[] arr = {10,20,30,40,50};
		System.out.println("Array Elements:");
		/*for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}*/
	
/*Array Elements:
10 20 30 40 50 
*/
	
	//Using Enhanced Loop
	
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
/*Array Elements:
10 20 30 40 50 */
		
	}
}
