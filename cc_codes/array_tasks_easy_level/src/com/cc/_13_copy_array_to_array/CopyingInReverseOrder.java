package com.cc._13_copy_array_to_array;

public class CopyingInReverseOrder {

	public static void main(String[] args) {
		
		//Declaration, Creation & Initialization
//		int arr[] = {10, 20, 30, 40, 50};
//		int arr[] = {5, 10, 15, 20, 25};
		int arr[] = {4, 7, 12, 9, 16, 21};
		
		//Method to copy array in reverse order 
		int brr[] = copyArrayInReverseOrder(arr);
		
		//Print copied array
		printCopiedArray(brr);	
	}

	//Method to print the reversed array
	public static void printCopiedArray(int[] brr) {
		System.out.print("{");
		for(int i : brr) {
			System.out.print(i + " ");
		}
		System.out.print("}");
	}

	//Method to copy array in reverse order 
	public static int[] copyArrayInReverseOrder(int[] arr) {
		int brr[] = new int[arr.length];
		
		for(int i = arr.length - 1  ; i >= 0 ; i--) {
			brr[arr.length - 1 - i] = arr[i];
		}
		return brr;
	}
}


/*
{10, 20, 30, 40, 50}
{50 40 30 20 10 }
*/



/*
{5, 10, 15, 20, 25}
{25 20 15 10 5 }
*/


/*
{4, 7, 12, 9, 16, 21}
{21 16 9 12 7 4 }
*/

