package com.cc._06_seraching_technique;

import java.util.Scanner;

public class LinearSearchMultipleOccurence {

	public static void main(String[] args) {

//		int[] arr = {15,28,37,44,59};
//		int[] arr = {12,34,45,34,78,34};
		int[] arr = {1,2,3,4,5};
 		
		Scanner sc = new Scanner(System.in);
		
		//Method to print array
		System.out.println("----------------Array elements are-----------------");
		traverseArray(arr);
		
		System.out.println();
		System.out.print("Enter the element to serach : ");
		int element = sc.nextInt();
		
		//Method to return the indexs if array element is occured
		indexofOccuredElemnt(arr,element);
		
		//Release resources
		sc.close();
	}

	//Method to traverse & print the array
	private static void traverseArray(int[] arr) {

		System.out.print("[");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}
	
	//Method to print the index/indices of occurred element
	public static void indexofOccuredElemnt(int[] arr, int element) {

		int count = 0;
		System.out.println("Index/Indices");
		for (int i = 0; i < arr.length; i++) {
			if(element == arr[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Element " + element +" not found in array");
		}
	}
}


/*
----------------Array elements are-----------------
[15 28 37 44 59 ]
Enter the element to serach : 37
Index/Indices
2 
*/


/*
----------------Array elements are-----------------
[12 34 45 34 78 34 ]
Enter the element to serach : 34
Index/Indices
1 3 5 
*/


/*
----------------Array elements are-----------------
[1 2 3 4 5 ]
Enter the element to serach : 6
Index/Indices
Element 6 not found in array
*/