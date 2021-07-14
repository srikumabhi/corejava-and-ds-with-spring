package com.corejava.practice.dspractices.array;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class EquilibriumPoint {
	/**
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	public static int equilibriumPoint(long arr[], int n) {

		long sumOfElementsBefore = 0;
		int equilibriumPoint = -1;

		if(arr.length==1) {
			equilibriumPoint = arr.length;
		} else {
			for(int i=1; arr.length>i; i++) {
				sumOfElementsBefore += arr[i-1];
				long sumOfElementsAfter=0;
				for(int j=i+1; arr.length>j; j++) {
					sumOfElementsAfter += arr[j];
				}
				if(sumOfElementsBefore==sumOfElementsAfter) {
					equilibriumPoint = i+1;
				}
			}
		}
		return equilibriumPoint;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long arr [] = new long [] {2,3,1,3,5,2,2};
		System.out.println(equilibriumPoint(arr, arr.length));
	}
}
