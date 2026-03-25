package com.cc._10_sum_of_array_elements;

public class UsingBruteForce {

	public static void main(String[] args) {
		
		//Declaration, creation & Initialization
//		int arr[] = {1, 2, 3, 4, 5};
//		int arr[] = {10, 20, 30};
//		int arr[] = {100, 200, 300};
		int arr[] = {5, 10, 15, 20, 25};
		
		//Iterate the array to add all elements 
		int sum = addArrayElements(arr);
		System.out.println("Sum is = " +sum);
	}

	//Method to find the sum of array elements
	public static int addArrayElements(int[] arr) {
		int sum = 0 ;
		
		for(int i : arr) {
			sum = sum + i;
		}
		return sum;
	}
}



/*
{1, 2, 3, 4, 5}
Sum is = 15
*/


/*
{10, 20, 30}
Sum is = 60
*/


/*
{100, 200, 300}
Sum is = 600
*/


/*
{5, 10, 15, 20, 25}
Sum is = 75
*/