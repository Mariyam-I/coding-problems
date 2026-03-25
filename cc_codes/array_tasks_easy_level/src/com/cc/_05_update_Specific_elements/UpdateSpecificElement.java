package com.cc._05_update_Specific_elements;

import java.util.Scanner;

public class UpdateSpecificElement {
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);

		//Declaration & Creation
		System.out.print("Enter array size = ");
		int arr[] = new int[keyboard.nextInt()];
		
		//Initialization
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter Element " + (i+1) + " = ");	
			arr[i] = keyboard.nextInt();
		}
		
		//Take the element & index from user 
		System.out.print("Enter Element to insert = ");	
		int specifiedElement = keyboard.nextInt();
		
		System.out.print("Enter Index at which index element should be inserted  = ");	
		int index = keyboard.nextInt();
		
		//Method to Update Element at specific position
		arr = updateElement(arr, specifiedElement , index);
		
		//Method to traverse the array and print the elements
		traverseArray(arr);
		
		//Release resources
		keyboard.close();
		
	}

	//Method to traverse & print the array
	public static void traverseArray(int[] arr) {
		System.out.println("---------Array Elements are---------");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("arr[" + (i) +  "] = " +arr[i]);
		}
		
	}

	public static int[] updateElement(int[] arr, int specifiedElement, int index) {
		
		if(index <= 0 || index > arr.length) {
			System.out.println("Invalid Index!!!");
		} else {
			arr[index] = specifiedElement;
		}
		return arr;
	}
}



/*Enter array size = 4
Enter Element 1 = 1
Enter Element 2 = 2
Enter Element 3 = 3
Enter Element 4 = 4
Enter Element to insert = 5
Enter Index at which index element should be inserted  = 2
---------Array Elements are---------
arr[ 0 ] = 1
arr[ 1 ] = 2
arr[ 2 ] = 5
arr[ 3 ] = 4
*/


/*Enter array size = 4
Enter Element 1 = 1
Enter Element 2 = 2
Enter Element 3 = 3
Enter Element 4 = 4
Enter Element to insert = 5
Enter Index at which index element should be inserted  = -1
Invalid Index!!!
---------Array Elements are---------
arr[0] = 1
arr[1] = 2
arr[2] = 3
arr[3] = 4
*/


/*Enter array size = 4
Enter Element 1 = 1
Enter Element 2 = 2
Enter Element 3 = 3
Enter Element 4 = 4
Enter Element to insert = 5
Enter Index at which index element should be inserted  = 6
Invalid Index!!!
---------Array Elements are---------
arr[0] = 1
arr[1] = 2
arr[2] = 3
arr[3] = 4
*/