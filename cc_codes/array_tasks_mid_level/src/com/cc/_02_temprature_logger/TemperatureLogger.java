package com.cc._02_temprature_logger;

public class TemperatureLogger {

	public static void main(String[] args) {

//		int[] arr = {32, 35, 30, 29, 40, 38};
//		int[] arr = {25, 25, 25, 25};
//		int[] arr = {20};
		int[] arr = {-5, -10, -3};
		
		findMaxMinTemp(arr);
	}

	public static void findMaxMinTemp(int[] arr) {

		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
	}

}


/*
Max = 40
Min = 29
*/


/*
Max = 25
Min = 25
*/


/*
Max = 25
Min = 25
*/


/*
Max = -3
Min = -10
*/