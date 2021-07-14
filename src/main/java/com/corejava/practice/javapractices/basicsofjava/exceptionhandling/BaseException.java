package com.corejava.practice.javapractices.basicsofjava.exceptionhandling;

/**
 * Make this class abstract so that developers are forced to create
 * Suitable exception types only
 *
 * @author abhishek-sriv
 */
public class BaseException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Each exception message will be held here
	private String message;

	/**
	 * 
	 * @param msg
	 */
	public BaseException(String msg){
		super(msg);
		this.message = msg;
	}

	//Message can be retrieved using this accessor method
	public String getMessage() {
		return message;
	}
}
