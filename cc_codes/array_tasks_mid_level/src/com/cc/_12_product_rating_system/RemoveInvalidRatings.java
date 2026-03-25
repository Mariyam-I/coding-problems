package com.cc._12_product_rating_system;

public class RemoveInvalidRatings {

	public static void main(String[] args) {

//		int[] arr = {4, -1, 5, -2, 3};
//		int[] arr = {1, 1, 1, 1};
		int[] arr = {0, -3, 2, 4};
		
		
		removeInvalid(arr);
	}

	public static void removeInvalid(int[] arr) {

		int count = 0;
		
		for (int i : arr) {
			if(i >= 0) {
				System.out.print(" "+i);
				count++;
			}
		}
		
		if(count == arr.length) {
			System.out.println("No Invalid int the array");
		} else if(count == 0) {
			System.out.println("ALl rating are Invalid");
		} 
	}
		
}



//4 5 3


//1 1 1 1


//0 2 4



