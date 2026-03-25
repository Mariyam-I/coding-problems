package com.cc._10_sum_of_array_elements;

public class UsingDivideAndConquer {

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

	//Method to find the sum of array elements by dividing into two halves
	public static int addArrayElements(int[] arr) {
		int sum1 = 0;
		
		//Adding first half
		for(int i = 0 ; i < arr.length / 2 ; i++) {
			sum1 = sum1 + arr[i];
		}
		
		int sum2 = sum1;
		//Adding second half into first half
		for(int i = arr.length / 2 ; i < arr.length ; i++) {
			sum2 = sum2 + arr[i];
		}
		return sum2;
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