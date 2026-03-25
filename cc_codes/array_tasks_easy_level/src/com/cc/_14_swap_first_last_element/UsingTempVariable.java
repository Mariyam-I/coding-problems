package com.cc._14_swap_first_last_element;

public class UsingTempVariable {

	public static void main(String[] args) {

		//Declaration, Creation & Initialization
//		int arr[] = {10, 20, 30, 40, 50};
//		int arr[] = {2, 4, 6, 8, 10};
//		int arr[] = {5, 10, 15, 20, 25};
		int arr[] = {3, 6, 9, 12, 15};
		
		//Logic to swap the element using temp 
		swapFirstLastElement(arr);
	}

	//Using temp Variable
	public static void swapFirstLastElement(int[] arr) {

		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
		
		System.out.print("{");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.print("}");
		
	}

}

/*
{10, 20, 30, 40, 50}
{50 20 30 40 10 }
*/



/*
{2, 4, 6, 8, 10}
{10 4 6 8 2 }
*/



/*
{5, 10, 15, 20, 25}
{25 10 15 20 5 }
*/



/*
{3, 6, 9, 12, 15}
{15 6 9 12 3 }
*/

