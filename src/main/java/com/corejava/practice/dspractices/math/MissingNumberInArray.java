package com.corejava.practice.dspractices.math;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class MissingNumberInArray {
	/**
	 * 
	 * @param array
	 * @param n
	 * @return
	 */
	int MissingNumber(int array[], int n) {

		int j=1;
		int misElement=0;

		for(int i=0; i<n; i++) {
			if(array[i]+1==array[j]) {
				j++;
			} else {
				misElement = array[i]+1;
				break;
			}
		}
		return misElement;
	} 

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//int array[] = new int [] {1,2,3,4,5,6,7,8,10};
		int array[] = new int [] {121,122,123,124,125,126,127,128,120};
		System.out.println(new MissingNumberInArray().MissingNumber(array,9));
	}
}
