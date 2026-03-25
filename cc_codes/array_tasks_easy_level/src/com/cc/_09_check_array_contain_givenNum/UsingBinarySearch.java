package com.cc._09_check_array_contain_givenNum;

public class UsingBinarySearch {

	public static void main(String[] args) {
		
		//Declaration, Creation & Initialization
//		int arr[] = {10, 20, 30, 40, 50};
//		int arr[] = {1, 2, 3, 4, 5};
//		int arr[] = {100, 200, 300, 400};
		int arr[] = {5, 10, 15, 20, 25};
		
		
		//Taking element to be search 
//		int num = 30;
//		int num = 7;
//		int num = 300;
		int num = 50;		
		
		//First sort the given array before searching using bubble sort
		arr = sortArray(arr);
		
		//Traverse the array Using  binary search approach
		boolean found = isNumFound(arr , num);
				
		//Return true if number is present or false if not
		if(found == true) {
			System.out.println("number found....");
		} else {
			System.out.println("number not found!!!");
		}
	}

	//Method to sort the array 
	public static int[] sortArray(int[] arr) {
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
		}
		return arr;
	}

	//Method to find the element using binary search 
	public static boolean isNumFound(int[] arr, int num) {
		int left = 0 , right = arr.length - 1 ;
		
		while(right >= left) {
			int mid = (left + right) / 2;
			
			if(num == arr[mid]) {
				return true;
			} else if(num > arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}	
}




/*
{10, 20, 30, 40, 50}     num : 30
number found....
*/



/*
{1, 2, 3, 4, 5}         num : 7
number not found!!!
*/


/*
{100, 200, 300, 400}   num : 300
number found....
*/


/*
{5, 10, 15, 20, 25}    num : 50
number not found!!!
*/