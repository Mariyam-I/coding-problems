package com.cc._11_customer_order_management_system;


public class SwapFirstLastOrder {

	public static void main(String[] args) {
		
//		int[] arr = {101,202,303,404,505};
//		int[] arr = {3001,2001,1001};
//		int[] arr = {101};
		int[] arr = {102,102,102};
		//int[] arr = {};
		
		swapingFirstLastOrder(arr);

	}

	public static void swapingFirstLastOrder(int[] arr) {
		
		if(arr.length == 0) {
			System.out.println("Empty Array");
		}
		
		 int temp = arr[0];
		 arr[0] = arr[arr.length-1];
		 arr[arr.length-1] = temp;
		 
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + "  ");
		 }
	}

}



//101  202  303  404  505  



//1001  2001  3001  



//101  