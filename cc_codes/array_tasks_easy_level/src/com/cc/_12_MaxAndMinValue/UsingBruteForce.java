package com.cc._12_MaxAndMinValue;

public class UsingBruteForce {

	public static void main(String[] args) {
		
		//Declaration, Creation & Initialization
//		int arr[] = {12, 3, 8, 22, 15};
//		int arr[] = {5, 25, 15, 7, 30};
		int arr[] = {45, 7, 12, 90, 23, 8};
		
		//Method to find min element in array
		int max = maxElement(arr);
		System.out.println("Maximum element is " +max);

		//Method to find max element in array
		int min = minElement(arr);
		System.out.println("Minimum element is " +min);
	
	
	}

	//Method to find max element
	public static int maxElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	//Method to find min element
	public static int minElement(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < arr.length ; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
}


/*
{12, 3, 8, 22, 15}
Maximum element is 22
Minimum element is 3
*/



/*
{5, 25, 15, 7, 30}
Maximum element is 30
Minimum element is 5
*/



/*
{45, 7, 12, 90, 23, 8}
Maximum element is 90
Minimum element is 7
*/