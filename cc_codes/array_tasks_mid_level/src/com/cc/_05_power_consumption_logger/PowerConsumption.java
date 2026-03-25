package com.cc._05_power_consumption_logger;

public class PowerConsumption {

	public static void main(String[] args) {

//		int[] arr = {10, 20, 30, 40};
//		int[] arr = {0, 0, 0};
//		int[] arr = {15};
		int[] arr = {5, 10, 15, 0};
		
		powerTotalAndAvg(arr);
		
	}

	public static void powerTotalAndAvg(int[] arr) {

		int total = 0;
		double avg = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		
		avg = total / arr.length;
		
		System.out.println("Total = "+total);
		System.out.println("Average = "+avg);
	}

}


/*
Total = 100
Average = 25.0
*/



/*
Total = 0
Average = 0.0
*/


/*
Total = 15
Average = 15.0
*/


/*
Total = 30
Average = 7.0
*/