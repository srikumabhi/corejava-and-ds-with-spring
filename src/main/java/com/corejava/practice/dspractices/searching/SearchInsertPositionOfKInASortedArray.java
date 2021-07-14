package com.corejava.practice.dspractices.searching;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class SearchInsertPositionOfKInASortedArray {
	/**
	 * 
	 * @param Arr
	 * @param N
	 * @param k
	 * @return
	 */
	static int searchInsertK(int Arr[], int N, int k) {
		int index=0;
		for(int i=0; i<N; i++) {
			if(Arr[i]==k) {
				index=i;
				break;
			} else {
				if((Arr[i]-1)==k) {
					index = i;
				} else {
					if((Arr[i]+1)==k) {
						index = (i+1);
					}
				}
			}
		}
		System.out.println("Index: "+index);
		return index;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int Arr[] = new int[] {-14, -3, 1, 4, 5, 13};
		searchInsertK(Arr, Arr.length, -12);
	}

}
