package com.cc._12_MaxAndMinValue;

public class SortingInAscendingOrder {

	public static void main(String[] args) {
		
		//Declaration, Creation & Initialization
//		int arr[] = {12, 3, 8, 22, 15};
//		int arr[] = {5, 25, 15, 7, 30};
		int arr[] = {45, 7, 12, 90, 23, 8};
		
		//Sort the array in ascending order using bubble sort 
		arr = sortArrayUsingBubbleSort(arr);
		
		//Pick the first element as min & last element as max value 
		minMaxElement(arr);
		
	}

	public static void minMaxElement(int[] arr) {
		
		System.out.println("Minimum element is : " +arr[0]);
		System.out.println("Maximum element is : " +arr[arr.length - 1]);	
	}

	//Method to sort the array 
	public static int[] sortArrayUsingBubbleSort(int[] arr) {
		int temp = 0 ;
		//for loop for no.of passes 
		for(int j = 0 ; j < arr.length-1 ; j++) {
			boolean isSwap = false;             
			//for loop for no.of comparison
			for(int i = 0 ; i < arr.length-1-j ; i++) {
				//condition to check if first element is greater than second 
				if(arr[i] > arr[i+1]) {
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
}



/*
{12, 3, 8, 22, 15}
Minimum element is : 3
Maximum element is : 22
*/



/*
{5, 25, 15, 7, 30}
Minimum element is : 5
Maximum element is : 30
*/



/*
{45, 7, 12, 90, 23, 8}
Minimum element is : 7
Maximum element is : 90
*/