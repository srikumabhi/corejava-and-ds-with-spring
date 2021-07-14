package com.corejava.practice.javapractices.basicsofjava.variables;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Narrowing {

	/*
	 * When a larger primitive type value is assigned in a smaller size primitive data type, 
	 * this is called narrowing of the variable. 
	 * It can cause some data loss due to less number of bits available to store the data. 
	 * It requires explicit type-casting to required data type.
	 * 
	 * In given example, int type variable is assigned to byte type variable with data loss.
	 */
	public void NarrowingImpl() {
		int i = 198;  
		byte j = (byte)i;  

		System.out.println("i=> "+i);  
		System.out.println("j=> "+j);  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Narrowing().NarrowingImpl();
	}

}
