package com.cc._19_sort_array;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5,4,10,1,2,6};
	
		//Print the array before sorting 
		System.out.println("------> Original Array");
		traverseArray(arr);
		
		//Method to sort the array using insertion sorting
		arr = insetionSort(arr);
		
		System.out.println();
		
		//Print array after sorting
		System.out.println("------> Array after sorting");
		traverseArray(arr);
	}
	
	//Method to traverse & print the array elements 
	public static void traverseArray(int[] arr) {
	
		System.out.print("{");
		for (int i : arr) {
			System.out.print(i +" ");
		}
		System.out.print("}");
	}
	
	//Logic of Insertion sort 
	private static int[] insetionSort(int[] arr) {
	
		int temp = 0 ;
		
		//outer for loop for unsorted array
		for(int i = 1 ; i < arr.length ; i++) {
			temp = arr[i];
			
			int j  = i - 1;       //Sorted array
			
			//logic to shift element from its position by one
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				
				j--;
			}
			arr[j+1] = temp;
		}
	return arr;	
	}
	
}



/*
------> Original Array
{5 4 10 1 2 6 }
------> Array after sorting
{1 2 4 5 6 10 }
*/

