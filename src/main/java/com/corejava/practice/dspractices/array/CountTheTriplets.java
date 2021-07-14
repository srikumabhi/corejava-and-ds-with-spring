package com.corejava.practice.dspractices.array;

import java.util.HashMap;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class CountTheTriplets {
	/**
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	int countTriplet(int arr[], int n) {

		int countTriplet = 0; 

		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		for(int i=0; n>i; i++) {
			hashMap.put(arr[i], i);
		}
		for(int i=0; n>i; i++) {
			for(int j=i+1; n>j; j++) {
				if((hashMap.containsKey(arr[i]+arr[j]))) {
					//(j!=i) &&
					countTriplet++;
					/*
					 * System.out.println("arr[i]="+arr[i]+" arr[j]="+arr[j]+"" +
					 * " {arr[i]+arr[j]}=>"+ (arr[i]+arr[j]));
					 */
				}
			}
		}
		return countTriplet;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = new int[] {14, 3, 6, 8, 11, 16};
		System.out.println(new CountTheTriplets().countTriplet(arr, arr.length));
	}

}
