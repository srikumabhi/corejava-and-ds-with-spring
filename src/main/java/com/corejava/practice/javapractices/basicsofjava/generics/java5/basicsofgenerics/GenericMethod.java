package com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics;

/**
 * 
 * @author Administrator
 *
 */
public class GenericMethod {

	/**
	 * 
	 * @param arrayElements
	 */
	public < E > void genericMethodForPrintArray(E[] arrayElements) { 

		for ( E arrayElement : arrayElements){          
			System.out.println(arrayElement);  
		}

	}  

}
