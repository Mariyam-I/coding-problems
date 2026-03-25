package com.cc._13_copy_array_to_array;

public class UsingBruteForce {

	public static void main(String[] args) {
		
		//Declaration, Creation & Initialization
//		int arr[] = {10, 20, 30, 40, 50};
//		int arr[] = {5, 10, 15, 20, 25};
		int arr[] = {4, 7, 12, 9, 16, 21};
		
		//Method to copy into another array by iterating 
		int brr[] = copyArrayElements(arr);
		
		//Print copied array
		printCopiedArray(brr);	
	}

	//Method to print copied array
	public static void printCopiedArray(int[] brr) {
		System.out.print("{");
		for(int i : brr) {
			System.out.print(i + " ");
		}
		System.out.print("}");
	}
	
	//Method to coyp array into another array
	public static int[] copyArrayElements(int[] arr) {
		int brr[] = new int[arr.length];
		
		for(int i = 0 ; i < arr.length ; i++) {
			brr[i] = arr[i];
		}
		return brr;
	}
}



/*
{10, 20, 30, 40, 50}
{10 20 30 40 50 }
*/



/*
{5, 10, 15, 20, 25}
{5 10 15 20 25 }
*/



/*
{4, 7, 12, 9, 16, 21}
{4 7 12 9 16 21 }
*/