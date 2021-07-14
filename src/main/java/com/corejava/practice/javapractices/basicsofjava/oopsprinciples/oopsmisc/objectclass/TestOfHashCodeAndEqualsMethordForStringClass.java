package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.oopsmisc.objectclass;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestOfHashCodeAndEqualsMethordForStringClass {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String string1 = new String("Welcome");
		String string2 = new String("Welcome");

		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		
		System.out.println(string1==string2);
		System.out.println(string1.equals(string2));
	}
}
