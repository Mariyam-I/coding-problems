package com.cc_06_remove_element;

import java.util.Scanner;

public class RemoveElementAtSpcifiedPosition {
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
	
		//Declaration & Creation
		System.out.print("Enter array size = ");
		int arr[] = new int[keyboard.nextInt()];
		
		//Initialization
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("Enter Element " + (i+1) + " = ");	
			arr[i] = keyboard.nextInt();
		}
		
		//Take the position from user 
		System.out.print("Enter position at which the element should be removed  = ");	
		int position = keyboard.nextInt();
		
		//checking the position given with size of array 
		if(position > arr.length) {
			System.out.println("position value is greater than the size of array.....");
		} else {
		//Remove the Element at given position
		int[] crr = removeElement(arr , position);
		
		//Traverse the array
		traverseArray(crr);
		}
		
		//Release the resources
		keyboard.close();
		
	}

	//Method to traverse the array & print the array Element
	public static void traverseArray(int crr[]) {
		
		for(int i = 0 ; i < crr.length ; i++) {
			System.out.println("crr[" + i + "] = " +crr[i]);
		}			
	}
		
	//Method to remove the specified Element at the given position
	public static int[] removeElement(int[] arr, int position) {
			
		int brr[] = new int[arr.length - 1];
		
		for(int i = 0 ; i < brr.length ; i ++) {				
			if(i < (position - 1)) {
				brr[i] = arr[i];
			} else {
				brr[i] = arr[i + 1];
			}
		}
		return brr; 
	}
}




/*
Enter array size = 5
Enter Element 1 = 1
Enter Element 2 = 2
Enter Element 3 = 3
Enter Element 4 = 4
Enter Element 5 = 5
Enter position at which the element should be removed  = 2
crr[0] = 1
crr[1] = 3
crr[2] = 4
crr[3] = 5


*
Enter array size = 5
Enter Element 1 = 1
Enter Element 2 = 2
Enter Element 3 = 3
Enter Element 4 = 4
Enter Element 5 = 5
Enter position at which the element should be removed  = 50
position value is greater than the size of array.....

*/
