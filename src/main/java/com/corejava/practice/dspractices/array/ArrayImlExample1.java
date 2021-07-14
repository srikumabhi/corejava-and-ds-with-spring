package com.corejava.practice.dspractices.array;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ArrayImlExample1 {

	@SuppressWarnings("unused")
	public void playOnArray() {

		//declaring array
		int intArray1[];
		// allocating memory to array
		intArray1 = new int[6];

		// combining both statements in one
		int [] intArray2 = new int[6];

		// Declaring array-literal
		int [] intArray3 = new int[] {1,2,3,4,5,6};

		int [] reserveOfintArray3 = new int[6];

		//System.out.println(intArray3.length);
		for(int element:intArray3) {
			//System.out.println(element);
		}
		for (int i=0; intArray3.length>i; i++) {
			//System.out.println(intArray3 [i]);
		}
		int j=0;
		for(int i=(intArray3.length-1); i>-1; i--) {
			reserveOfintArray3[j] = intArray3 [i];
			j++;
		}
		for(int element:reserveOfintArray3) {
			System.out.println("reserveOfintArray3=> "+element);
		}	
	}

	public static void main(String[] args) {
		new ArrayImlExample1().playOnArray();
	}
}
