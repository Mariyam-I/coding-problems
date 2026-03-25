package com.cc._02_arrays_mid_level;

public class KadanesAlgo {

	public static void main(String[] args) {

		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArraySum(arr));
	}

	public static int maxSubArraySum(int[] arr) {
		int maxSum = arr[0]; // Start with first element
		int currentSum = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			// Either 1) start fresh from current element if that’s bigger
			// or 2) keep adding to current
			currentSum = Math.max(arr[i], currentSum + arr[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}

//6
