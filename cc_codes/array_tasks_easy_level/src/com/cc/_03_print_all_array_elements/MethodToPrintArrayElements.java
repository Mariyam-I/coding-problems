package com.cc._03_print_all_array_elements;

public class MethodToPrintArrayElements {

	public static void main(String[] args) {

		int[] arr = {5,10,15,20,25,30};
		
		//Using for loop
		System.out.println("----------Using for loop-----------");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//Using Enhanced for loop
		System.out.println();
		System.out.println("----------Using Enhanced for loop-----------");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		//Using While loop
		System.out.println();
		System.out.println("----------Using While loop-----------");
		int i = 0;
		while(i < arr.length) {
			System.out.print(arr[i] + " ");
			i++;
		}
		
		//Using Do-While loop
		System.out.println();
		System.out.println("----------Using Do-While loop-----------");
		int j = 0;
		do {
			System.out.print(arr[j] + " ");
			j++;
		} 
		while(j < arr.length) ;		
	}
}



/*
----------Using for loop-----------
5 10 15 20 25 30 
----------Using Enhanced for loop-----------
5 10 15 20 25 30 
----------Using While loop-----------
5 10 15 20 25 30 
----------Using Do-While loop-----------
5 10 15 20 25 30
*/