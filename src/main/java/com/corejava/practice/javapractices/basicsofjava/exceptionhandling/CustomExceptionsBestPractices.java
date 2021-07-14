package com.corejava.practice.javapractices.basicsofjava.exceptionhandling;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class CustomExceptionsBestPractices {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try{
			throw new CustomExceptionsByStaticNestedClasses.NoData(
					"No row found for id : x");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
