package com.cc._01_arrays_easy_level;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		System.out.println("Before :");
		printArray(arr);
		
		arr = reverse(arr);
		
		System.out.println("\nAfter :");
		printArray(arr);
		
	
	}
	

	private static void printArray(int[] arr) {

		System.out.print("[ ");
		for(int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.print("]");
	}


	private static int[] reverse(int[] arr) {
	
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		
		return arr;
	}

}


/*Before :
[ 1, 2, 3, 4, 5, ]
After :
[ 5, 4, 3, 2, 1, ]
*/







