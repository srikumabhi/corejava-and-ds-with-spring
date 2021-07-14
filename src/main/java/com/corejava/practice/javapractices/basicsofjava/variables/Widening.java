package com.corejava.practice.javapractices.basicsofjava.variables;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Widening {

	/*
	 * When a small primitive type value is automatically accommodated in a bigger/wider 
	 * primitive data type, this is called widening of the variable.
	 * 
	 * In given example, int type variable is assigned to long type variable 
	 * without any data loss or error.
	 */
	public void WideningImpl() {

		int i = 10;
		long j = i;

		System.out.println("i=> "+i);
		System.out.println("j=> "+j);
	}

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		new Widening().WideningImpl();	
	}

}
