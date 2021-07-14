package com.corejava.practice.dspractices.array;

import java.util.Arrays;

public class RotateArray {

	public void RotateArrayImpl() {

		// int [] intArray = new int[6];

		// Declaring array-literal
		int[] intArray = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		int beg1 = 0;
		int end1 = 1;
		int[] subarray1 = new int[end1 - beg1 + 1];
		for (int i = 0; i < subarray1.length; i++) {
			subarray1[i] = intArray[beg1 + i];
		}
		// System.out.println(Arrays.toString(subarray1));

		int beg = 2;
		int end = 6;
		int sumOfElements = 0;
		int[] subarray2 = new int[end - beg + 1];
		for (int i = 0; i < subarray2.length; i++) {
			subarray2[i] = intArray[beg + i];
			sumOfElements = sumOfElements + subarray2[i];
		}
		System.out.println("Array:-" + Arrays.toString(subarray2) + ", Sum of elements:-" + sumOfElements);

		/**
		 * {10,20,30,40,50,60,70,80,90,100} arr[0]=10, arr[1]=20, arr[2]=30, arr[3]=40,
		 * arr[4]=50, arr[5]=60
		 * 
		 * Using pre-defined method
		 */
		int subarray3[] = Arrays.copyOfRange(intArray, 2, 7);
		System.out.println("Using pre-defined method:-" + Arrays.toString(subarray3));

		/**
		 * 
		 */
		int from = 2;
		int to = 7;
		int length = (to - from);
		int subArray4[] = new int[length];
		int j = 0;
		for (int i = from; i < to; i++) {
			subArray4[j] = intArray[i];
			j++;
		}
		System.out.println("Without using pre-defined method:-" + Arrays.toString(subArray4));

		/**
		 * 
		 */
		// resultant array size
		int intArray2Lenth = subarray1.length + subarray2.length;
		// create the resultant array
		int[] intArray2 = new int[intArray2Lenth];
	}

	// Function to rotate an array by d elements in counter-clockwise direction.
	/**
	 * 
	 * @param arr
	 * @param d
	 * @param n
	 */
	public void rotateArrExample1(int arr[], int d, int n) {
		System.out.println("arr:-" + Arrays.toString(arr));
		int[] aar1 = new int[d];
		int[] aar2 = new int[n - d];

		for (int i = 0; i < d; i++) {
			aar1[i] = arr[i];
		}
		//System.out.println("aar1:-" + Arrays.toString(aar1));

		int k = 0;
		for (int j = d; j < n; j++) {
			aar2[k] = arr[j];
			k++;
		}
		//System.out.println("aar2:-" + Arrays.toString(aar2));

		for(int h=0; h<aar2.length; h++) {
			arr[h] = aar2[h];
		}
		//System.out.println("arr:-" + Arrays.toString(arr));

		int t=0;
		for(int l=aar2.length; l<n; l++) {
			arr[l] = aar1[t];
			t++;
		}
		System.out.println("arr:-" + Arrays.toString(arr));
	}

	public void rotateArrExample2(int arr[], int d, int n) {

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// new RotateArray().RotateArrayImpl();

		int[] arr = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int d = 3;
		int n = 10;
		new RotateArray().rotateArrExample1(arr, d, n);
	}
}
