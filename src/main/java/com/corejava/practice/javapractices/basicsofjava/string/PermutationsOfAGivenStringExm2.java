package com.corejava.practice.javapractices.basicsofjava.string;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfAGivenStringExm2 {

	List<String> listOfPermutations = new ArrayList<String>();

	public void permutation(String str) { 
		System.out.println(permutation("", str)); 
	}

	private List<String> permutation(String prefix, String str) {
		int n = str.length();

		if (n == 0){
			listOfPermutations.add(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				permutation(prefix + str.charAt(i), 
						str.substring(0, i) + str.substring(i+1, n));
			}
		}
		return listOfPermutations;
	}

	public static void main(String[] args) {
		new PermutationsOfAGivenStringExm2().permutation("ABC");
	}

}
