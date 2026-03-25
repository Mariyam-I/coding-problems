package com.cc._08_first_last_occurence_ofnumber;

public class UsingBinarySarch {

	public static void main(String[] args) {
		
		//Declaration, Creation  Initialization
//		int arr[] = {4, 2, 1, 2, 2, 3, 5, 2, 6};
//		int arr[] = {1, 2, 2, 2, 3, 4, 5, 6};
		int arr[] = {5, 8, 5, 3, 5, 8, 8, 8};
//		int arr[] = {2, 4, 6, 8, 10};
		
		//Taking element to be search 
//		int element = 2;
//		int element = 2;
		int element = 8;
//		int element = 7;
		
		//Sort the array using bubble sort 
		arr = sortArray(arr);
		
		//Print array
		printArray(arr);
		System.out.println();
		
		//Method to find first Occurrence using binary Search
		int first = firstOccurrence(arr, element);
		System.out.println("First Occurrence : "+first);
		
		//Method to find last Occurrence using binary Search
		int last = lastOccurrence(arr, element);
		System.out.println("Last Occurrence : "+last);
	}

	public static void printArray(int[] arr) {
		System.out.println();
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

	//Method to Sort the Array using Bubble Sort
	public static int[] sortArray(int[] arr) {
		int temp = 0;
		
		//Loop for number of Passes
		for(int i = 0; i < arr.length-1 ; i++) {
			int count = 0;
			//Loop for Number of Comparison
			for(int j = 0 ; j < arr.length-1-i ; j++) {
				//Method to Swap the two elements
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count++;
				}
			}
			//If count remains 0 then array is sorted completely
			if(count == 0) {
				break;
			}
		}
		return arr;
	}

	//Method to find first Occurrence using binary Search
	public static int firstOccurrence(int[] arr, int element) {

		int left = 0 , right = arr.length - 1 ;
		int first = -1;
		
		while(right >= left) {
			int mid = (left + right) / 2;
			
			if(element == arr[mid]) {
				first = mid;
				right = mid - 1;     //To search only left side
			} else if(element > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return first;
	}

	//Method to find last Occurrence using binary Search
	public static int lastOccurrence(int[] arr, int element) {
		
		int left = 0 , right = arr.length - 1 ;
		int last = -1;
		
		while(right >= left) {
			int mid = (left + right) / 2;
			
			if(element == arr[mid]) {
				last = mid;
				left = mid + 1;      //To search only right side
			} else if(element > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return last;
	}

}


/*   {4, 2, 1, 2, 2, 3, 5, 2, 6}    element : 2
1 2 2 2 2 3 4 5 6 
First Occurrence : 1
Last Occurrence : 4
*/



/*  {1, 2, 2, 2, 3, 4, 5, 6}       element : 2
1 2 2 2 3 4 5 6 
First Occurrence : 1
Last Occurrence : 3
*/



/*  {5, 8, 5, 3, 5, 8, 8, 8}      element : 8
3 5 5 5 8 8 8 8 
First Occurrence : 4
Last Occurrence : 7
*/



/*  {2, 4, 6, 8, 10}             element : 7
2 4 6 8 10 
First Occurrence : -1
Last Occurrence : -1
*/