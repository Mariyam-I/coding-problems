package com.cc._03_arrays_hard_level;

public class MooresVotingAlgo {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 1, 1, 2, 2, 2 };

		System.out.println(majorityEle(arr));
	}

	private static int majorityEle(int[] arr) {

		int candidate = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (candidate == arr[i]) {
				count++;
			} else {
				count--;
				if (count == 0) {
					candidate = arr[i];
					count = 1;
				}
			}
		}

		count = 0;
		for (int i : arr) {
			if (candidate == i) {
				count++;
			}
		}

		if (count > arr.length / 2) {
			return candidate;
		} else {
			return -1;
		}
	}

}

// 2
