package com.cc._06_identifying_empty_seat;

public class EmptySeatIdentifier {

	public static void main(String[] args) {

//		int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 0, 1}; 
//		int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; 
//		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		//Corner Cases
//		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 
//		int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; 
		int[] arr = {0, 1, 1, 1, 1, 1, 1, 1, 1, 0}; 
		
		identifySeats(arr);
		
	}

	public static void identifySeats(int[] arr) {

		int empty = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				empty++;
			}
		}
		
		System.out.println("Empty Seats = "+empty);
		
		//Corner Cases
		if(empty == 10) {
			System.out.println("All Seats empty");
		} else if(empty == 0) {
			System.out.println("All seats occupied");
		}
		
		int i = 0;
		while(i <= arr.length) {
			if(arr[0] == 0 && arr[arr.length - 1] == 0) {
				System.out.println("First and last seats empty only");
			}
			i++;
		}
		
	}
}



//Empty Seats = 5



//Empty Seats = 0



//Empty Seats = 10


//All Seats empty



//All seats occupied



//First and last seats empty only