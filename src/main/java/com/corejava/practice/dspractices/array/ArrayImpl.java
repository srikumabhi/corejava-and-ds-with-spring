package com.corejava.practice.dspractices.array;

import java.util.Arrays;

public class ArrayImpl {

	int[] myArrayInt;
	Integer[] myArrayInteger;
	String[] myArrayString;

	//Float[] fnums = {23.9f,5.5f,10.8f,2.5f,82.0f};
	//Double[] dnums = {12.5,244.92,1.9,98.3,35.2};
	//String[] strings = {"banana","pineapple","apple","mango","jackfruit"};

	public void arrayDeclarationAndInitialization(){

		//Declaration & Instantiation 
		myArrayInt = new int[5];
		myArrayInteger = new Integer[5];
		myArrayString = new String[5];

		//initialization of myArrayInt
		myArrayInt[0]=1;  
		myArrayInt[1]=9;  
		myArrayInt[2]=8;  
		myArrayInt[3]=3;  
		myArrayInt[4]=2;

		//initialization of myArrayInteger
		myArrayInteger[0]=19;  
		myArrayInteger[1]=91;  
		myArrayInteger[2]=43;  
		myArrayInteger[3]=79;  
		myArrayInteger[4]=33;
	}

	public void arrayTraversing(){

		for (int element: myArrayInt) {
			System.out.println(element);
		}	
	}

	public void arrayMaxEleemnt(){

		//Let maxElement is first element
		int maxElement = myArrayInt[0];

		for (int element: myArrayInt) {
			if(element > maxElement){
				maxElement=element;
			}	
		}

		//System.out.println(max);
		System.out.println("Max Element of Array is " +maxElement);
	}

	public void arrayMinEleemnt(){

		//Let minElement is first element
		int minElement = myArrayInt[0];

		for (int element: myArrayInt) {
			if(minElement > element){
				minElement=element;
			}
		}

		//System.out.println(minElement);
		System.out.println("Min Element of Array is " +minElement);
	}

	public void arrayShorting(){
		Arrays.sort(myArrayInt);
		arrayTraversing();
	}

	public void arrayShortingWithoutMeth(){

		arrayTraversing();

		for (int i = 0; i < myArrayInt.length; i++) {
			for (int j = i + 1; j < myArrayInt.length; j++) {
				int tmp = 0;
				if (myArrayInt[i] > myArrayInt[j]) {
					tmp = myArrayInt[i];
					myArrayInt[i] = myArrayInt[j];
					myArrayInt[j] = tmp;
				}
			}
		}

		arrayTraversing();
	}

	public void arrayOfAlternativeElements(){

		arrayShortingWithoutMeth();

		// even positions
		for (int i = 0; i < myArrayInt.length; i=i+2) {
			System.out.print(" "+ i + "-" + myArrayInt[i] + ",");
		}

		// odd positions
		for (int i = 1; i < myArrayInt.length; i=i+2) {
			System.out.print(" "+ i + "-" + myArrayInt[i] + ",");
		}
	}

	public void margeOfTwoArrays(){

	}
	
	
}
