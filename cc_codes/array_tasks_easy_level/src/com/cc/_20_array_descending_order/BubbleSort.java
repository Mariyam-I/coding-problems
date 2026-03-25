package com.cc._20_array_descending_order;

public class BubbleSort {

	public static void main(String[] args) {
		
		//DEclaration, Creation & Initialization
		int arr[] = {5, 1, 4, 2, 8};
		
		//Print array before sorting 
		System.out.println("-----> Original Array");
		traverseArray(arr);
		
		System.out.println();
		
		//Sort the array using bubble sort in descending order
		arr = sortedArray(arr);
		
		//Print array after sorting 
		System.out.println("-----> After Sorting Array");
		traverseArray(arr);
	}

	//Optimize method to sort array in de order
	public static int[] sortedArray(int[] arr) {

		int temp = 0 ;
		//for loop for no.of passes 
		for(int j = 0 ; j < arr.length-1 ; j++) {
			boolean isSwap = false;             
			//for loop for no.of comparision
			for(int i = 0 ; i < arr.length-1-j ; i++) {
				//condition to check if first element is greater than second 
				if(arr[i] < arr[i+1]) { // < for desc while it is > for asce
					//if condition is true swap the two element 
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					//update the swap to true 
					isSwap = true;
				}
			}
			//if remains swap false then numbers are already sorted 
			if(isSwap == false) {
				break;
			}
		}
		return arr;
	}

	//Method to print the array 
	public static void traverseArray(int[] arr) {

		System.out.print("{");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("}");
	}	

}



/*
-----> Original Array
{5 1 4 2 8 }
-----> After Sorting Array
{8 5 4 2 1 }
*/
