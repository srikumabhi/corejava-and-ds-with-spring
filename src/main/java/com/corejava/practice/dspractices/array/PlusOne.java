package com.corejava.practice.dspractices.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class PlusOne {

	/**
	 * 
	 * @param list
	 * @param n
	 * @return
	 */
	public ArrayList<Integer> plusOne(List<Integer> arr, int N ){

		String sList = new String();
		ArrayList<Integer> listPlusOne = new ArrayList<Integer>();

		for(int i =0; i<N; i++) {
			sList += arr.get(i);
		}
		System.out.println("sList:- "+sList);
		
		Integer nList = Integer.valueOf(sList);
		Integer number = nList+1;
		sList = String.valueOf(number);
		System.out.println("sList:- "+sList);

		for(int j=0; j<sList.length(); j++) {
			System.out.println(sList.charAt(j));
			listPlusOne.add(Integer.valueOf(Character.toString(
					sList.charAt(j))));
		}
		return listPlusOne;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//2529127493
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(5);
		list.add(2);
		list.add(9);
		list.add(1);
		list.add(2);
		list.add(7);
		list.add(4);
		list.add(9);
		list.add(3);

		int size = list.size();

		// Function calling
		System.out.println(new PlusOne().plusOne(list, size));
	}
}
