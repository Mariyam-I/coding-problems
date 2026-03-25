package com.cc._18_remove_duplicate_element;

public class UsingSorting {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2, 3, 6, 1 };
		
		System.out.print("Duplicate elements are: ");
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					
					break;
				}
			}
		}
	}
}



//Duplicate elements are: 1 3 