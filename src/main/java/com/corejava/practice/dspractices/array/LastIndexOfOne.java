package com.corejava.practice.dspractices.array;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class LastIndexOfOne {
	/**
	 * 
	 * @param s
	 * @return
	 */
	public int lastIndex( String s) {
		int lastIndexOfOne = -1;
		char arr[]=s.toCharArray();
		for(int i=0; (arr.length-1)>=i; i++) {
			if(arr[i]=='1') {
				lastIndexOfOne = i;
			}
		}
		return lastIndexOfOne;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String inputString = "00001";
		System.out.println(new LastIndexOfOne().lastIndex(inputString));
	}
}
