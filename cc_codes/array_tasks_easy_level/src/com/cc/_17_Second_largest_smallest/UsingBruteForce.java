package com.cc._17_Second_largest_smallest;

public class UsingBruteForce {

	public static void main(String[] args) {

		//Declaration, Creation & Initialization
//		int arr[] = {12, 5, 8, 19, 7, 25};
		int arr[] = {1, 2, 3, 4, 5};
//		int arr[] = {99, 45, 12, 67, 34};
//		int arr[] = {10, 10, 10, 10};
			
		
		//Sort the array in Ascending order
		arr = bubbleSort(arr);
		
		//Traverse array print second largest & second smallest element
		secondSmallestLargest(arr);
	}

	//Method to pirnt second smallest & largest element of array
	public static void secondSmallestLargest(int[] arr) {

		int sSmall = arr[1];
		int sLarge = arr[arr.length - 2];
		
		if(sLarge == sSmall) {
			System.out.println("Not Found");
			System.out.print("Not Found");
		} else {
		System.out.println(sSmall);
		System.out.print(sLarge);
		}
	}

	//Method to sort the array elements using bubble sort
	public static int[] bubbleSort(int[] arr) {
		
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
			if(isSwap == false) {
				break;
			}
		}
		return arr;
	}
}



/*
{12, 5, 8, 19, 7, 25}
7
19
*/



/*
{1, 2, 3, 4, 5}
2
4
*/



/*
{99, 45, 12, 67, 34}
34
67
*/



/*
{10, 10, 10, 10}
Not Found
Not Found
*/