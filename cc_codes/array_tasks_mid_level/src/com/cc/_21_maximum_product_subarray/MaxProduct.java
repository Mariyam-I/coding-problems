package com.cc._21_maximum_product_subarray;

public class MaxProduct {

		public static void main(String[] args) {
			int[] arr = {2, 3, -2, 4};
			
			splitArray(arr);
		}

		public static void splitArray(int[] arr) {

			int[] arr1 = new int[arr.length / 2];
			int[] arr2 = new int[arr.length - arr1.length];
			
			System.out.println(arr1.length);
			System.out.println(arr2.length);
			
			int prod1 = findProduct(arr1);
			int prod2 = findProduct(arr2);
			
			int max = findMaxProduct(prod1, prod2);
			System.out.println(max);
		}

		private static int findMaxProduct(int prod1, int prod2) {
			
			if(prod1 > prod2)
			{
				return prod1;
			} else {
				return prod2;
			}
		}

		public static int findProduct(int[] arr) {

			int product = 1;
			for(int i=0; i<arr.length; i++) {
				product = product*arr[i];
			}
			System.out.print(product);
			return product;
		}
}
