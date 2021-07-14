package com.corejava.practice.javapractices.basicsofjava.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaStreamMapVsflatMapMethods {
	/**
	 * 
	 * @param <T>
	 * @param arr
	 * @return 
	 */
	public List<String> useOfMapMethod(Integer arr[]) {
		List<String> listString = Arrays.asList(arr).stream().
				map((x) -> String.valueOf(x)).
				collect(Collectors.toList());
		return listString;
	}
	/**
	 * 
	 * @param arr
	 * @return
	 */
	public List<String> useOfFlatMapMethod(Integer arr1[], Integer arr2[], 
			Integer arr3[] ) {
		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(arr1), 
				Arrays.asList(arr2),
				Arrays.asList(arr3));
		List<String> listMaped = listOfLists.stream().
				flatMap((x)->x.stream()).
				map((y)->String.valueOf(y)).
				collect(Collectors.toList());
		return listMaped;
	}
	/**
	 * 
	 * @param <T>
	 * @param <T>
	 * @param args
	 */
	public static  void main(String[] args) {
		/** */
		Integer arr[] = new Integer[] {1,2,3,4,5,6,7,8,9};
		List<String> list =  new JavaStreamMapVsflatMapMethods().
				useOfMapMethod(arr);
		list.forEach(e->System.out.println(e));
		/** */
		Integer arr1[] = new Integer[] {1,2,3};
		Integer arr2[] = new Integer[] {4,5,6};
		Integer arr3[] = new Integer[] {7,8,9};
		List<String> mapedlist =  new JavaStreamMapVsflatMapMethods().
				useOfFlatMapMethod(arr1, arr2, arr3);
		mapedlist.forEach((e)->System.out.println(e));
	}
}
