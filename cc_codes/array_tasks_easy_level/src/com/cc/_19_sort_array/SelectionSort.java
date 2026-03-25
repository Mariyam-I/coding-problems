package com.cc._19_sort_array;

public class SelectionSort {

	public static void main(String[] args) {

		// Declaration, Creation & Initialization
		int arr[] = { 16, 14, 5, 6, 8 };

		// Print array before sorting
		System.out.println("-----> Original Array");
		traverseArray(arr);

		System.out.println();

		// Sort the array using bubble sort
		arr = selSort(arr);

		// Print array after sorting
		System.out.println("-----> After Sorting Array");
		traverseArray(arr);
	}

	//Method to sort array in ascending order by selection sort
	public static int[] selSort(int[] arr) {
		int temp = 0;
		
		for(int i = 0; i < arr.length-1; i++) {
			int smallIndex = i;
			
			for(int j = i+1; j < arr.length; j++) {
				if(arr[smallIndex] > arr[j]) {
					smallIndex = j;
				}
			}
			
			//Swap the selected element with smallest element 
			temp = arr[smallIndex];
			arr[smallIndex] = arr[i];
			arr[i] = temp;
		}
		
		return arr;
	}
	

	// Method to print the array
	public static void traverseArray(int[] arr) {

		System.out.print("{");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("}");
	}

}



/*

-----> Original Array
{16 14 5 6 8 }
-----> After Sorting Array
{5 6 8 14 16 }

*/

