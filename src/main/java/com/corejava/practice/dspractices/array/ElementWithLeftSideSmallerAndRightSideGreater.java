package com.corejava.practice.dspractices.array;

import java.util.HashMap;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ElementWithLeftSideSmallerAndRightSideGreater {
	/**
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	public int findElement(int arr[], int n){
		int element = -1;
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

		for(int i=0; n-1>i; i++) {
			if((i>0) && (arr[i]>=arr[i-1]) && (arr[i+1]>=arr[i])) {
				if( (hashMap.containsValue(arr[i])) ) {
					element = -1;
				} else { 
					element = arr[i];
					hashMap.put(i, arr[i]);
				}
			} else {
				if(arr[i]==element) {element=-1;}
				hashMap.put(i, arr[i]);
			}
		}
		return element;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//int arr[] = new int []{4, 2, 5, 7};
		//int arr[] = new int []{5, 6, 4, 1, 7, 12, 9, 1, 4, 1, 11, 5, 7, 1};
		int arr[] = new int []{11, 5, 4, 11, 3, 12, 5, 7, 12, 3, 8, 5, 8, 11};
		//10 6 3 1 5 11 6 1 11 12
		System.out.println(new ElementWithLeftSideSmallerAndRightSideGreater().
				findElement(arr, arr.length));
	}
}
