package com.cc_04_finding_index;

import java.util.Scanner;

public class FindIndexOfSpecifiedElement {
	
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
		
		//Take the specified element from the user for finding  
		System.out.print("Enter the element to be search = ");
		int specifiedElement = keyboard.nextInt();
		
		//Traverse the array
		int index = findIndex(arr , specifiedElement);
		
		//Return index if number is present
		if(index == -1) {
			System.out.println("Element is not present in array");
		} else {
			System.out.println("Element " + specifiedElement +" is present at index " + index);
		}
		
		//Release resources
		keyboard.close();
	}
	
	//Method to find the index of element if it is present in array
	public static int findIndex(int[] arr, int specifiedElement) {
		for(int i = 0 ; i < arr.length ;i++) {
			if(specifiedElement == arr[i]) {
				return i ;
			} 
		}
		return -1;	
	}
}



/*Enter the size of array = 4
Enter the element 1 =1
Enter the element 2 =2
Enter the element 3 =3
Enter the element 4 =4
Enter the element to be search = 3
Element 3 is present at index 2
*/


/*Enter the size of array = 3
Enter the element 1 =1
Enter the element 2 =2
Enter the element 3 =3
Enter the element to be search = 4
Element is not present in array
*/