package com.corejava.practice.dspractices.array;

import java.util.ArrayList;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class FindSubarrayWithGivenSumNonnegativeNumbersExample1 {

	/**
	 * 
	 * @param arr
	 * @param n
	 * @param s
	 * @return
	 */
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int stratIndex = 0; int endIndex= 0;

		for(int i=0; n>i; i++) {
			int reqSubarraySum = 0;
			for (int j = stratIndex; n>j; j++) {
				reqSubarraySum = reqSubarraySum + arr[j];
				if(s == reqSubarraySum) {
					endIndex = j;
					list.add(stratIndex+1);
					list.add(endIndex+1);
					return list;
				} 
			}
			stratIndex++;
		}

		if(list.isEmpty()) {
			list.add(-1);
		}

		return list;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = new int [] {1,2,3,4,5,6,7,8,9,10};
		int n=10; int s = 15;
		//int arr[] = new int [] {1,2,3,7,5};
		//int n=5; int s=12;
		System.out.println("List:="+subarraySum(arr, n, s));
	}
}
