package com.corejava.practice.dspractices.array;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class FrequenciesOfLimitedRangeArrayElements {
	/**
	 * 
	 * @param arr
	 * @param n
	 */
	public static void frequencycount(int arr[], int n) {
		int farr[] = new int [n];
		for(int i=0; i<n; i++) {
			int count = 0;
			for(int k=0; k<n; k++) {
				if(arr[i]==arr[k]) {
					count++;
				}
			}
			farr[arr[i]-1] = count;
		}
		for(int i=0; i<n; i++) {
			arr[i] = farr[i];
		}
		for(int element : arr) {
			System.out.println(element);
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//int arr[] = new int [] {2,3,2,3,5};
		int arr[] = new int [] {3, 3, 3, 3};
		frequencycount(arr, arr.length);
	}

}
