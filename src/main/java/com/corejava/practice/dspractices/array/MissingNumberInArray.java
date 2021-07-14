package com.corejava.practice.dspractices.array;
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
		int missElement=0;
		if(n==2) {
			if(array[0]==1) {
				missElement = array[0]+1;
			} else {
				missElement = array[0]-1;
			}
		} else {
			for(int i=0; array.length-1>i; i++) {
				if(((array[i]+1)!=array[i+1])) {
					missElement = array[i]+1;
					break;
				}
				if(missElement==0) {
					missElement=array[array.length-1]+1;
				}
			}
		}
		return missElement;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int [] {1,2,3,4,5,6,7,8,10};
		System.out.println(new MissingNumberInArray().MissingNumber(
				array, array.length+1));
	}
}
