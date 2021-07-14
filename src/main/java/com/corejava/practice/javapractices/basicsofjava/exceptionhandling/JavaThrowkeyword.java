package com.corejava.practice.javapractices.basicsofjava.exceptionhandling;

/**
 * 
 */
public class JavaThrowkeyword{

	/**
	 * 
	 * @param age
	 */
	public void voterAgeValidation(int age){  
		if(age<18)  
			throw new ArithmeticException("not a valid voter...");  
		else  
			System.out.println("welcome to vote!!");  
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){  
		JavaThrowkeyword javaThrowkeyword = new JavaThrowkeyword();
		javaThrowkeyword.voterAgeValidation(17); 
	}  
}