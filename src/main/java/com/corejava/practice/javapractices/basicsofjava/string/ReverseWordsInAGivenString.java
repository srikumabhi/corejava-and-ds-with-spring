package com.corejava.practice.javapractices.basicsofjava.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ReverseWordsInAGivenString {

	String reverseWords(String s) {
		String words[] = s.split("\\.");
		String result = "";

		for (int i = words.length - 1; i >= 0; i--) {
			result += words[i];
			if(i!=0)
				result += '.';
		}
		return result;
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public String reverseWordExm2(String inputString) {

		String outputString = "";
		String[] inputStringArray = inputString.split("\\.");

		List<String> inputStringList = new ArrayList<String>();
		for(String s :inputStringArray) { 
			inputStringList.add(s);
		}

		Collections.reverse(inputStringList);

		int i = 0;
		for(String s : inputStringList) {
			outputString += s;
			if(i!=inputStringList.size()-1)
				outputString += '.';
			i++;
		}

		/*
		 * ListIterator<String> inputStringListIterator =
		 * inputStringList.listIterator(); while (inputStringListIterator.hasPrevious())
		 * {
		 * 
		 * System.out.println("index:-"+inputStringListIterator.previousIndex() +
		 * "value:-"+inputStringListIterator.previous());
		 * 
		 * outputString += inputStringListIterator.previous();
		 * 
		 * if(inputStringListIterator.previousIndex()!=0) { outputString +='.'; } }
		 */

		return outputString;
	}

	public static void main(String args[]) {
		System.out.println(
				new ReverseWordsInAGivenString().reverseWordExm2(
						"i.like.this.program.very.much"));
	}

}
