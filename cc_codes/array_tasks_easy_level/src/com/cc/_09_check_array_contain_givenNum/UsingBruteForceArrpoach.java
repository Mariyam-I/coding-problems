package com.cc._09_check_array_contain_givenNum;

public class UsingBruteForceArrpoach {
	
	public static void main(String[] args) {
				
		//Declaration, Creation & Initialization
//		int arr[] = {10, 20, 30, 40, 50};
//		int arr[] = {1, 2, 3, 4, 5};
//		int arr[] = {100, 200, 300, 400};
		int arr[] = {5, 10, 15, 20, 25};
		
		//Take the specified element for checking  
//		int num = 30;
//		int num = 7;
//		int num = 300;
		int num = 50;
		
		//Traverse the array Using Linear serach approach
		boolean found = isNumFound(arr , num);
		
		//Return true if number is present or false if not
		if(found == true) {
			System.out.println("number found....");
		} else {
			System.out.println("number not found!!!");
		}
}

	//Method to search the element in the given array
	public static boolean isNumFound(int[] arr, int num) {

		for(int i = 0 ; i < arr.length ; i++)  {
			if(num == arr[i]) {
				return true ;
			} 
		}
		return false;
	}
}



/*
{10, 20, 30, 40, 50}   num : 30
number found....
*/


/*
{1, 2, 3, 4, 5}      num : 7
number not found!!!
*/


/*
{100, 200, 300, 400}   num : 300
number found....
*/


/*
{5, 10, 15, 20, 25}     num : 50
number not found!!!
*/