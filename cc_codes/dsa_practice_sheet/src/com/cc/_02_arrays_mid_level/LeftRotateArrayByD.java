package com.cc._02_arrays_mid_level;

public class LeftRotateArrayByD {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		int d = 2;
		
		System.out.println("\nBefore");
		printAyyar(arr);
		
		arr = leftRotate(arr, d);
		
		System.out.println("\nAfter");
		printAyyar(arr);
	}

	 public static int[] leftRotate(int[] arr, int d) {
	        int n = arr.length;
	        d = d % n; // handle if d > n

	        reverse(arr, 0, d - 1);    // reverse first d elements
	        reverse(arr, d, n - 1);    // reverse remaining elements
	        reverse(arr, 0, n - 1);    // reverse entire array
			return arr;
	    }

	    public static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }

	private static void printAyyar(int[] arr) {

		System.out.print("[");
		for(int i : arr) {
			System.out.print(i + " " );
		}
		System.out.print("]");

	}

}






/*Before
[1 2 3 4 5 ]
After
[3 4 5 1 2 ]
*/
