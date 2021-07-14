package com.corejava.practice.dspractices.array;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
	/**
	 * Function to merge the arrays.
	 * 
	 * @param arr1
	 * @param arr2
	 * @param n
	 * @param m
	 */
	public static void merge(long arr1[], long arr2[], int n, int m) {
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		long [] mergeArray = new long[(n+m)];
		Arrays.parallelSort(arr1);
		Arrays.parallelSort(arr2);
		System.arraycopy(arr1, 0, mergeArray, 0, n);  
		System.arraycopy(arr2, 0, mergeArray, n, m); 

		Arrays.parallelSort(mergeArray);
		System.out.println(Arrays.toString(mergeArray));

		arr1 = Arrays.copyOfRange(mergeArray, 0, n);
		System.out.println(Arrays.toString(arr1));

		arr2 = Arrays.copyOfRange(mergeArray, n, n+m);
		System.out.println(Arrays.toString(arr2));
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long a1[] = new long[] {1, 3, 5, 7};
		long a2[] = new long[] {0, 2, 6, 8, 9};
		MergeWithoutExtraSpace.merge(a1, a2, a1.length, 
				a2.length);
	}
}
