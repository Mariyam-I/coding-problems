package com.cc._06_seraching_technique;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		
		//Declaration, Creation & Initialization
		int[] arr = {5,9,17,23,25,45,59,63,71,89};
		
		//Method to print array elements
		traverseArray(arr);
		System.out.println();
		
		//Taking element from user for finding
		System.out.print("Enter element to be search : ");
		int key = sc.nextInt();
		
		//Method to search the element in sn array
		int found = binarySearch(arr , key);
		
		//Return true if number is present or false if not
		if(found == -1) {
			System.out.println("Key Element not found");
		} else {
			System.out.println("Element found at " + found + " index");
		}
		
		//Release resources
		sc.close();
	}

	//Method to pirnt array elements
	public static void traverseArray(int[] arr) {

		System.out.println("-------Array Elements------");
		System.out.print("[");
		for (int i : arr) {
			System.out.print( i + " ");
		}
		System.out.print("]");
	}

	//Method to find the given element in array
	public static int binarySearch(int[] arr, int key) {
	
		int left = 0 , right = arr.length-1 ;
		
		while(left <= right) {
			
			int mid = (left + right) / 2 ;
			
			if(key == arr[mid]) {
				return mid;
			} else if(key > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		
		return -1;
	}

}



/*-------Array Elements------
[5 9 17 23 25 45 59 63 71 89 ]
Enter element to be search : 17
Element found at 2 index
*/


/*
-------Array Elements------
[5 9 17 23 25 45 59 63 71 89 ]
Enter element to be search : 6
Key Element not found
*/