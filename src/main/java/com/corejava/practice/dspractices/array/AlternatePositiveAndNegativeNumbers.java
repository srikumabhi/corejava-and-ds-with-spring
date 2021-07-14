package com.corejava.practice.dspractices.array;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class AlternatePositiveAndNegativeNumbers {
	/**
	 * 
	 * @param arr
	 * @param n
	 */
	public void rearrange(int arr[], int n) {

		int [] aarPosElements = new int[n];
		int [] arrNevElements = new int[n];

		int j=0; int k=0;
		int p=0; int q=0;
		for(int i=0; i<n; i++) {
			if(arr[i]>=0){
				aarPosElements [j] = arr[i];
				j++;
			}else{
				arrNevElements [k] = arr[i];
				k++;
			}
		}
		for(int h=0; h<n; h++) {
			if(0==h%2 && j>p) {
				arr[h] = aarPosElements[p];
				p++;
			} else if(0!=h%2 && k>q){
				arr[h] = arrNevElements[q];
				q++;
			}
		}
		for(int elememt : arr) { 
			System.out.println(elememt); 
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//9, -2 ,4, -1, 5, -5, 0, -3, 2
		// 9,4,5,0,2
		//-2,-1,-5,-3
		//int arr[] = new int[] {9, 4, -2, -1, 5, 0, -5, -3, 2};
		int arr[] = new int[] {4,5,6,7,-1};
		new AlternatePositiveAndNegativeNumbers().rearrange(arr, arr.length);
	}
}
