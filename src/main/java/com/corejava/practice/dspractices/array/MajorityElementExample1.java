package com.corejava.practice.dspractices.array;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class MajorityElementExample1 {

	// Function to find Majority element
	// in an array
	public void findMajority(int arr[], int n) {

		int presenceOfElement = 0;
		int posibleMajoirityElementIndex = -1;
		int majorityIndex = n/2;

		for(int i=0; i<n; i++) {
			int elementCount = 0;
			for(int j=0; j<n; j++) {
				if(arr[i]==arr[j]) {
					elementCount++;
				}
			}
			if(elementCount>presenceOfElement) {
				presenceOfElement = elementCount;
				posibleMajoirityElementIndex = i;
			}
		}

		if( presenceOfElement >= majorityIndex) {
			int MajorityElement = arr[posibleMajoirityElementIndex];
			System.out.println("MajorityElement:-"+MajorityElement);
		} else {
			System.out.println("Majority Element is not persent in provided array !!");
		}
	}

	// Driver code
	public static void main(String[] args) {

		//int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
		int arr[] =  {3, 1, 3, 3, 2};
		int n = arr.length;

		// Function calling
		new MajorityElementExample1().findMajority(arr, n);
	}
}
