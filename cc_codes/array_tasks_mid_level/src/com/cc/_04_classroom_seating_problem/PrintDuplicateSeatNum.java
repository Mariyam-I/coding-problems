package com.cc._04_classroom_seating_problem;

public class PrintDuplicateSeatNum {

	public static void main(String[] args) {

//		int[] arr = { 10, 20, 30, 20, 40, 10 };
//		 int[] arr = {1, 2, 3, 4};
		 int[] arr = {5, 5, 5, 5};
		// int[] arr = {};

		printDuplicate(arr);

	}

	public static void printDuplicate(int[] arr) {

		int count = 0;
		System.out.print("Duplicate seats : ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + ", ");
					count++;
					break;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("No");
		}
	}

}


/*   OUTPUT 

Duplicate seats : 10, 20, 


Duplicate seats : No


*/