package com.cc._11_reverse_array_without_extra_space;

public class UsingNewArray {

	public static void main(String[] args) {

		//Declaration, Creation & Initialization
//		int arr[] = {1, 2, 3, 4, 5};
//		int arr[] = {10, 20, 30};
		int arr[] = {5, 15, 25, 35};
		
		//Reverse the array by copying array into another array 
		int brr[] = reverseArray(arr);
		
		//print array after reversing
		printArray(brr);
	}

	//Method to reverse the array using another array
	public static int[] reverseArray(int[] arr) {

		int brr[] = new int[arr.length];
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			brr[arr.length - 1 - i] = arr[i];
		}
		return brr;
	}

	//Method to print the array
	public static void printArray(int[] brr) {

		for(int i : brr) {
			System.out.print(i + " ");
		}
	}
}




/*
{1, 2, 3, 4, 5}
5 4 3 2 1 
*/


/*
{10, 20, 30}
30 20 10 
*/


/*
{5, 15, 25, 35}
35 25 15 5 
*/