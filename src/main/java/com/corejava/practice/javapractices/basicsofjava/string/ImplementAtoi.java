package com.corejava.practice.javapractices.basicsofjava.string;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class ImplementAtoi {
	int atoi(String str) {
		int number = -1;
		try{
			for(int i=0; str.length()>i; i++) {
				number = Integer.parseInt(str);
			}
		}
		catch (NumberFormatException ex){
			return number;
		}
		return number;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}
}
