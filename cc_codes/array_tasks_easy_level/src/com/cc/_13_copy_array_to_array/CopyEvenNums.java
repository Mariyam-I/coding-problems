package com.cc._13_copy_array_to_array;

public class CopyEvenNums {

	public static void main(String[] args) {
		
		//Declaration, Creation & Initialization
//		int arr[] = {10, 20, 30, 40, 50};
//		int arr[] = {5, 10, 15, 20, 25};
		int arr[] = {4, 7, 12, 9, 16, 21};
		
		//Method to copy array in reverse order 
		int brr[] = copyEvenNumbers(arr);
		
		//Print copied array
		printCopiedArray(brr);	
	}

	// Method to copy even numbers from an array
	public static int[] copyEvenNumbers(int[] arr) {
		int brr[] = new int[arr.length];
		int index= 0;
		
		//Loop to copy only even numbers
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % 2 == 0) {
				brr[index] = arr[i];
				index++;
			}
		}
		
		//Create array of exact size
		int brr1[] = new int[index]; 
		for(int i = 0 ; i < index ; i++) {
			brr1[i] = brr[i];
		}
		return brr1;
	}

	//Method to print the reversed array
	public static void printCopiedArray(int[] brr) {
		System.out.print("{");
		for(int i : brr) {
			System.out.print(i + " ");
		}
		System.out.print("}");
	}
}



/*
{10, 20, 30, 40, 50}
{10 20 30 40 50 }
*/


/*
{5, 10, 15, 20, 25}
{10 20 }
*/


/*
{4, 7, 12, 9, 16, 21}
{4 12 16 }
*/

