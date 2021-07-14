package com.corejava.practice.dspractices.array;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ProductArrayPuzzle {

	/**
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	public static long[] productExceptSelf(int arr[], int n) {

		long productArray [] = new long[n];

		for(int i=0; i<n; i++) {
			long productAtIndex = 1;
			for(int j=0; j<n; j++) {
				if(i!=j)
					productAtIndex *= arr[j];
			}
			productArray[i] = productAtIndex;
		}

		return productArray; 
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int arr[] = new int[] {10, 3, 5, 6, 2};
		int n = arr.length;
		long productArr[] = productExceptSelf(arr, n);

		for(long element : productArr) {
			System.out.println(element);
		}	
	}

}
