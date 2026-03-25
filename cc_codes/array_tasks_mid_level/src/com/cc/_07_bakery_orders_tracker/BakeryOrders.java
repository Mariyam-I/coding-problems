package com.cc._07_bakery_orders_tracker;

public class BakeryOrders {

	public static void main(String[] args) {

//		int[] arr = {45, 67, 30, 90, 10};
//		int[] arr = {10, 20, 30, 40, 50};
//		int[] arr = {55, 60, 75, 100};
		int[] arr = {51, 30, 43, 21};
		
		orderExceeded(arr);
	}

	public static void orderExceeded(int[] arr) {

		int exceed = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 50) {
				exceed++;
			}
		}
		
		System.out.println("Output : "+exceed);
		
		if(exceed == arr.length) {
			System.out.println("All orders over 50");
		} else if(exceed == 0) {
			System.out.println("No orders over 50");
		} else if(exceed == 1) {
			System.out.println("Only one day with 51");
		}
	}

}


//Output : 2


/*
Output : 0
No orders over 50
*/

/*
Output : 4
All orders over 50
*/


/*
Output : 1
Only one day with 51
*/