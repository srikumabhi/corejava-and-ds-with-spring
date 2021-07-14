package com.corejava.practice.javapractices.basicsofjava.string;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String a,String b) {
		char[] arrayOfa = null;
		char[] arrayOfb = null;
		if(null!=a) {
			arrayOfa = a.replaceAll("s", "").toLowerCase()
					.toCharArray();
			Arrays.sort(arrayOfa);
		}
		if(null!=b) {
			arrayOfb = b.replaceAll("s", "").toLowerCase()
					.toCharArray();
			Arrays.sort(arrayOfb);
		}
		if(arrayOfa.length != arrayOfb.length) {
			return false;
		} else {
			return Arrays.equals(arrayOfa, arrayOfb);
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}
}
