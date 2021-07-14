package com.corejava.practice.dspractices.sorting;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class WaveArray {
	/**
	 * 
	 * @param arr
	 * @param n
	 */
	public static int  i=0; 
	public static int  j=1;
	public static void convertToWave(int arr[], int n) {
		if(arr[j]>arr[i]) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		i++; j++;
		if(n-2>=i && n-1>=j) {
			i++; j++;
			if(0==n%2)
				convertToWave(arr, n);
			else
				convertToWave(arr, n-1);
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//int arr[]= new int[] {20, 35, -15, 7, 55, 1, -22};
		//int arr[]= new int[] {2,4,7,8,9,10};
		//int arr[]= new int[] {1,2,3,4,5};
		int arr[]= new int[] {445,1581,1822,2153,3749,6783,7492,8713,9042,9281};
		convertToWave(arr, arr.length);

		for(int element : arr) {
			System.out.println("Element:>"+element);
		}
	}
}
