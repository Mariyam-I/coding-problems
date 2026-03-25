package com.cc._07_count_occurences_of_eelement;

import java.util.Scanner;

public class ForSortedArrayUsingBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaration & Creation
		System.out.print("Enter array size = ");
		int arr[] = new int[sc.nextInt()];
			
		//Initialization
		System.out.println("---------Array Elements are---------");
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter Element " + (i+1) + " = ");	
			arr[i] = sc.nextInt();
		}
		//Sorting Array using Binary Search
		arr = BubbleSort(arr);
		
		//Print sorted array 
		printArray(arr);
		
		//take array element from user to find occurrence
		System.out.println();
		
		System.out.print("Enter the element to be search : ");
		int key = sc.nextInt();
		
		//Find the first and last occurrence of element 
		int firstOccurence = firstOccurrenceUsingBinarySearch(arr, key);
		int lastOccurence = lastOccurrenceUsingBinarySearch(arr, key);
		
		//Print the count of no.of times element occurred 
		System.out.println("First occurrence = " +firstOccurence);
		System.out.println("Last occurrence = " +lastOccurence);
		
		int count = lastOccurence - firstOccurence + 1;   //Find the number of counts 
		
		if(count == 1) {
			System.out.println("Number of times given element occurred is 0");
		} else {
		System.out.println("Number of times given element occurred is " +count);
		}
		//Release resources 
		sc.close();
		
	}
	//Method to sort the given element
	public static int[] BubbleSort(int[] arr) {
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
		}		return arr;
	}
	
	//Method to print array element
	public static void printArray(int[] arr) {
		System.out.println("---------Sorted array Elements are---------");
		for(int i : arr) {
			System.out.print(i +" ");
		}
	}
	
	//Method to find first occurrence 
	public static int firstOccurrenceUsingBinarySearch(int[] arr, int key) {
		int left = 0 , right = arr.length-1 ;
		int firstOccurence = 0;
		
		while(left <= right) {
			
			int mid = (left + right) / 2 ;
			
			if(key == arr[mid]) {
				firstOccurence = mid;
				right = mid - 1;      //Search only left side
			} else if(key > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return firstOccurence;
	}	
	
	//Method to find last occurrence
	public static int lastOccurrenceUsingBinarySearch(int[] arr, int key) {
		int left = 0 , right = arr.length-1 ;
		int lastOccurence = 0;
		
		while(left <= right) {
			
			int mid = (left + right) / 2 ;
			
			if(key == arr[mid]) {
				lastOccurence = mid;
				left = mid + 1;       //Search only right side
			} else if(key > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return lastOccurence;
	
	}
}


/*
Enter array size = 7
---------Array Elements are---------
Enter Element 1 = 10
Enter Element 2 = 20
Enter Element 3 = 10
Enter Element 4 = 30
Enter Element 5 = 10
Enter Element 6 = 40
Enter Element 7 = 10
---------Sorted array Elements are---------
10 10 10 10 20 30 40 
Enter the element to be search : 10
First occurrence = 0
Last occurrence = 3
Number of times given element occurred is 4
*/


/*
Enter array size = 8
---------Array Elements are---------
Enter Element 1 = 5
Enter Element 2 = 8
Enter Element 3 = 5
Enter Element 4 = 3
Enter Element 5 = 5
Enter Element 6 = 8
Enter Element 7 = 8
Enter Element 8 = 8
---------Sorted array Elements are---------
3 5 5 5 8 8 8 8 
Enter the element to be search : 8
First occurrence = 4
Last occurrence = 7
Number of times given element occurred is 4
*/


/*
Enter array size = 8
---------Array Elements are---------
Enter Element 1 = 1
Enter Element 2 = 2
Enter Element 3 = 3
Enter Element 4 = 3
Enter Element 5 = 3
Enter Element 6 = 4
Enter Element 7 = 5
Enter Element 8 = 6
---------Sorted array Elements are---------
1 2 3 3 3 4 5 6 
Enter the element to be search : 3
First occurrence = 2
Last occurrence = 4
Number of times given element occurred is 3
*/


/*
Enter array size = 5
---------Array Elements are---------
Enter Element 1 = 2
Enter Element 2 = 4
Enter Element 3 = 6
Enter Element 4 = 8
Enter Element 5 = 10
---------Sorted array Elements are---------
2 4 6 8 10 
Enter the element to be search : 7
First occurrence = 0
Last occurrence = 0
Number of times given element occurred is 0
*/