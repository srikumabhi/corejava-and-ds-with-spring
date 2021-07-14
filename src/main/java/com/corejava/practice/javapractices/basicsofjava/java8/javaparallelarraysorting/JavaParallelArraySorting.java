package com.corejava.practice.javapractices.basicsofjava.java8.javaparallelarraysorting;

import java.util.Arrays;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component("javaparallelarraysorting")
public class JavaParallelArraySorting {

	/**
	 * 
	 */
	public void JavaParallelArraySortingExample1() {

		// Creating an integer array   
		int[] arrayOfElemnets = {5,8,1,0,6,9,2};  

		// Iterating array elements  
		for (int element : arrayOfElemnets) {  
			System.out.print(element+" ");  
		}  

		// Sorting array elements parallel  
		Arrays.parallelSort(arrayOfElemnets);  
		System.out.println("\nArray elements after sorting");  

		// Iterating array elements  
		for (int element : arrayOfElemnets) {  
			System.out.print(element+" ");  
		}  

	}
	
	/**
	 * 
	 */
	public void JavaParallelArraySortingExample2() {

		// Creating an integer array   
		int[] arrayOfElemnets = {5,51,8,1,0,6,9,2,98,21};  

		// Iterating array elements  
		for (int element : arrayOfElemnets) {  
			System.out.print(element+" ");  
		}  

		// Sorting array elements parallel  
		Arrays.parallelSort(arrayOfElemnets,5,6);  
		System.out.println("\nArray elements after sorting");  

		// Iterating array elements  
		for (int element : arrayOfElemnets) {  
			System.out.print(element+" ");  
		}  

	}

}
