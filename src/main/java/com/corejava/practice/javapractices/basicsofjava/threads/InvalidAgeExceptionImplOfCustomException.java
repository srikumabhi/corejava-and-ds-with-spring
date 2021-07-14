package com.corejava.practice.javapractices.basicsofjava.threads;

/**
 * Example of java custom exception
 * 
 * @author abhishek-sriv
 * @see Exception
 */
public class InvalidAgeExceptionImplOfCustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @param s
	 */
	public InvalidAgeExceptionImplOfCustomException(String s){  
		super(s);  
	}  
}
