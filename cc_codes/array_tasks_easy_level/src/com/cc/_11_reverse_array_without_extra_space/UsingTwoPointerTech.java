package com.cc._11_reverse_array_without_extra_space;

public class UsingTwoPointerTech {

	public static void main(String[] args) {
		
		//Declaration, Creation & Initialization
//		int arr[] = {1, 2, 3, 4, 5};
//		int arr[] = {10, 20, 30};
		int arr[] = {5, 15, 25, 35};
		
		//Reverse the array using two pointer technique
		reverseArray(arr);
		
		//print array after reversing
		printArray(arr);
	}

	//Method to print array
	public static void printArray(int[] arr) {
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

	//Method to reverse array
	public static void reverseArray(int[] arr) {
		int first = 0, last = arr.length - 1;
		int temp = 0 ;

		while(first < last) {
			temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;

			first++;
			last--;
		}
	}
}



/*
{1, 2, 3, 4, 5}
5 4 3 2 1 
*/


/*
{10, 20, 30}
30 20 10 
*/


/*
{5, 15, 25, 35}
35 25 15 5 
*/