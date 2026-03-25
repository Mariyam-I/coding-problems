package com.cc_05_insert_element;

import java.util.Scanner;

public class InsertElementAtSpecifiedIndex {

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
		
		//Take the element & index from user 
		System.out.print("Enter Element to insert = ");	
		int specifiedElement = keyboard.nextInt();
		System.out.print("Enter Index at which the element should be inserted  = ");	
		int index = keyboard.nextInt();
		
		//checking the index given with size of array 
		if(index > arr.length || index < 0) {
			System.out.println("Index value is greater/lesser than the size of array.....");
		} else {
		//Insert the Element
		int[] crr = insertElement(arr , specifiedElement , index);
		
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

	//Method to insert the specified Element at the given Index
	public static int[] insertElement(int[] arr, int specifiedElement, int index) {
		
		int brr[] = new int[arr.length+1];
		
		for(int i = 0 ; i < brr.length ; i ++) {
			
			if(i < index) {
				brr[i] = arr[i];
			} else if(i == index) {
				brr[i] = specifiedElement;
			} else {
				brr[i] = arr[i - 1];
			}
		}
		return brr; 
	}
}



/*
*
Enter array size = 3
Enter Element 1 = 10
Enter Element 2 = 30
Enter Element 3 = 40
Enter Element to insert = 20
Enter Index at which the element should be inserted  = 1
crr[0] = 10
crr[1] = 20
crr[2] = 30
crr[3] = 40


*
Enter array size = 4
Enter Element 1 = 10
Enter Element 2 = 20
Enter Element 3 = 30
Enter Element 4 = 40
Enter Element to insert = 50
Enter Index at which the element should be inserted  = 100
Index value is greater/lesser than the size of array.....

*/