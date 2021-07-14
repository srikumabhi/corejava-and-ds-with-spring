package com.corejava.practice.dspractices.array;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class BubbleSort {

	/**
	 * Function to sort the array using bubble sort algorithm.
	 * 
	 * @param arr
	 * @param n
	 */
	public void bubbleSort(int arr[], int n) {

		int unstortedPartitionIndex = (n-1);
		
		int j=1;
		for (int i=0 ; i<n && j<n; i++) {
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
		}
		
		unstortedPartitionIndex--;
		if(unstortedPartitionIndex>0) {
			bubbleSort(arr, n-1);
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//int arr[]= new int[] {20, 35, -15, 7, 55, 1, -22};
		int arr[]= new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		new BubbleSort().bubbleSort(arr, arr.length);
		
		for(int element : arr) {
			System.out.println("Element:>"+element);
		}
	}
}
