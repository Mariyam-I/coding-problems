package com.cc._16_avg_of_array_elements;

public class UsingBruteForce {

	public static void main(String[] args) {

		//Declaration, Creation & Initialization
//		int arr[] = {10, 20, 30, 40, 50};
//		int arr[] = {5, 15, 25, 35, 45};
//		int arr[] = {7, 14, 21, 28, 35};
		int arr[] = {1, 3, 5, 7, 9};
		
		//Method to find the Average of array ELement
		double avg = findAverageOfElements(arr);
		System.out.println(avg);
		
	}

	public static double findAverageOfElements(int[] arr) {

		double avg = 0;
		int sum = 0;
		
		for(int i : arr) {
			sum = sum + i;
		}
		
		avg = sum / arr.length;
		
		return avg;
	}
}


/*
{10, 20, 30, 40, 50}
30.0
*/


/*
{5, 15, 25, 35, 45}
25.0
*/


/*
{7, 14, 21, 28, 35}
21.0
*/



/*
{1, 3, 5, 7, 9}
5.0
*/

