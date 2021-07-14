package com.corejava.practice.dspractices.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class FindSubarrayWithGivenSumHandlesNegativeNumbersExample2 {
	/**
	 * 
	 * @param arr
	 * @param n
	 * @param s
	 * @return
	 */
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Map<Integer,Integer> hashMap = new  HashMap<Integer,Integer>();

		int resSubarraySum = 0;
		int startIndex = 0;
		int endIndex = -1;

		for(int i=0; n>i; i++) {
			resSubarraySum = resSubarraySum + arr[i];

			if(hashMap.containsKey(s)) {
				startIndex = (hashMap.get(0));
				endIndex = hashMap.get(s);
				
				arrayList.add(startIndex+1);
				arrayList.add(endIndex+1);
				return arrayList;
			}
			hashMap.put(resSubarraySum, i);
		}

		if(arrayList.isEmpty()) {
			arrayList.add(endIndex);
		}
		
		return arrayList;
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
