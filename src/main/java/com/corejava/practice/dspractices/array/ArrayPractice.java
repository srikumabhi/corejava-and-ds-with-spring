package com.corejava.practice.dspractices.array;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ArrayPractice {

	// Complete the reverseArray function below.
	static int[] reverseArray(int[] a) {

		int[] b = new int[a.length];

		int j = a.length;
		for(int i=0; i<a.length; i++){  
			b[j - 1] = a[i]; 
			j = j - 1;
		}

		return b;
	}

	public static void main(String args[]){

		int[] a = new int[4];
		a[0] = 1;
		a[1] = 4;
		a[2] = 3;
		a[3] = 2;

		int[] myArrayInt = reverseArray(a);
		for (int element: myArrayInt) {
			System.out.println(element);
		}    
	}

}
