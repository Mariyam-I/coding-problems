package com.cc._08_first_last_occurence_ofnumber;

public class OptimizedLinearSearch {

	public static void main(String[] args) {
		
		//Declaration , Creation & Initialization
//		int arr[] = {4, 2, 1, 2, 2, 3, 5, 2, 6};
//		int arr[] = {1, 2, 2, 2, 3, 4, 5, 6};
//		int arr[] = {5, 8, 5, 3, 5, 8, 8, 8};
		int arr[] =  {2, 4, 6, 8, 10};
				
		//Take the number to be search
//		int element = 2;
//		int element = 2;
//		int element = 8;
		int element = 7;
		
		//Traverse Array to find first & last Occurrence 
		findFirstOccurrence(arr, element);
	}

	//Method to find first last Occurrence 
	public static void findFirstOccurrence(int[] arr, int element) {
		int first = -1 , last = -1;

		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == element) {
			//if first is -1 then only update first value only once when number occurred first time
				if(first == -1) {
					first = i;
				}
				last = i;   //Update the value of last after each Occurrence 
			}
		}
		System.out.println("First Occurrence : "+first);
		System.out.println("Last Occurrence : "+last);
	}
}

/* 
{4, 2, 1, 2, 2, 3, 5, 2, 6}   element : 2
First Occurrence : 1
Last Occurrence : 7
*/


/*
{1, 2, 2, 2, 3, 4, 5, 6}     element : 2
First Occurrence : 1
Last Occurrence : 3
*/



/*
{5, 8, 5, 3, 5, 8, 8, 8}    element : 8
First Occurrence : 1
Last Occurrence : 7
*/



/*
{2, 4, 6, 8, 10}           elemeht : 7
First Occurrence : -1
Last Occurrence : -1
*/