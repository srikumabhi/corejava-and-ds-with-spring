package com.corejava.practice.javapractices.basicsofjava.string;

import java.util.LinkedHashSet;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class RemoveDuplicates {
	String removeDups(String S) {
		String withoutDups = "";
		LinkedHashSet<Character> linkedHashSet = new 
				LinkedHashSet<Character>();
		char[] arrayOfInputStr = S.toCharArray();
		for(char c : arrayOfInputStr) {
			linkedHashSet.add(c);
		}
		for(Character c : linkedHashSet) {
			withoutDups = (withoutDups + c).trim();
		}
		return withoutDups;
	}
}
