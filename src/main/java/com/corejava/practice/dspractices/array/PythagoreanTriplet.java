package com.corejava.practice.dspractices.array;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class PythagoreanTriplet {
	/**
	 * 
	 * @param arr
	 * @param n
	 * @return
	 */
	boolean checkTriplet(int[] arr, int n) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for(int element : arr) {
			int elementSqure = (element*element);
			linkedList.addLast(elementSqure);
		}
		for(int i=0; arr.length>i; i++) {
			for(int j=1; arr.length>j; j++) {
				if(linkedList.contains((arr[i]*arr[i])+(arr[j]*arr[j]))) {
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int arr [] = new int [] {5, 3, 2, 4, 6};
		System.out.println(new PythagoreanTriplet().checkTriplet(
				arr, arr.length));
	}
}
