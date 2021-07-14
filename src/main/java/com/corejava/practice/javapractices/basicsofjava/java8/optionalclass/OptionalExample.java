package com.corejava.practice.javapractices.basicsofjava.java8.optionalclass;

import java.util.Optional;

/**
 * 
 * @author Administrator
 *
 */
public class OptionalExample {

	/**
	 * 
	 */
	public void ifValueIsNotPresent(){

		String[] str = new String[10];  
		Optional<String> checkNull = Optional.ofNullable(str[5]);

		// check for value is present or not
		if(checkNull.isPresent()){    
			String lowercaseString = str[5].toLowerCase();  
			System.out.print(lowercaseString);  
		} else {
			System.out.println("string value is not present");
		}
	} 

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
}

