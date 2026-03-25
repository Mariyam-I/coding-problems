package com.cc_09_copying_array;

import java.util.Scanner;

public class CopyArrayByIterating {
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
	
		//Declaration & Creation
		System.out.print("Enter the size of array = ");
		int arr[] = new int[keyboard.nextInt()];
				
		//Initialization
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print("Enter the element " + (i+1) + " =");			
			arr[i] = keyboard.nextInt();
		}
		
		//Copying array in new array by iterating
		copyArray(arr);
		
		//Release resources
		keyboard.close();
	}

	//Method to copy array in new array
	private static void copyArray(int[] arr) {
		int[] brr = new int[arr.length];
		
		for(int i = 0; i < brr.length; i++) {
			brr[i] = arr [i];
			System.out.println("brr[ " + i + " ] = " +brr[i]);
		}
	}

}



/*Enter the size of array = 4
Enter the element 1 =11
Enter the element 2 =22
Enter the element 3 =33
Enter the element 4 =44
brr[ 0 ] = 11
brr[ 1 ] = 22
brr[ 2 ] = 33
brr[ 3 ] = 44


Enter the size of array = 4
Enter the element 1 =10
Enter the element 2 =20
Enter the element 3 =30
Enter the element 4 =40
brr[ 0 ] = 10
brr[ 1 ] = 20
brr[ 2 ] = 30
brr[ 3 ] = 40

*/

