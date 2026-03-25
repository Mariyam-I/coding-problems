package com.cc._02_arrays_mid_level;

public class MoveZerosToEnd {

	public static void main(String[] args) {

		int[] arr = {0,1,0,3,12};
		
		System.out.println("\nBefore");
		printAyyar(arr);
		
		arr = moveZerosEnd(arr);
		
		System.out.println("\nAfter");
		printAyyar(arr);
	}

	private static void printAyyar(int[] arr) {

		System.out.print("[");
		for(int i : arr) {
			System.out.print(i + " " );
		}
		System.out.print("]");

	}

	private static int[] moveZerosEnd(int[] arr) {

		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			
		}
		return arr;
	}

}



/*Before
[0 1 0 3 12 ]
After
[1 3 12 0 0 ]*/