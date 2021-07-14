package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.
encapsulation.accessmodifiers;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class PublicClassFromOutsideItsPackage {

	/*
	 * 
	 */
	private void accessModifierMsg(){
		System.out.println("Welcome of accessModifierMsg method of "
				+ "PublicClassFromOutsideItsPackage class");
	} 

	/*
	 * 
	 */
	void accessModifierPrint(){
		System.out.println("Welcome of accessModifierPrint method of "
				+ "PublicClassFromOutsideItsPackage class");
	} 

	/*
	 * 
	 */
	protected void accessModifierShow(){
		System.out.println("Welcome of accessModifierShow method of "
				+ "PublicClassFromOutsideItsPackage class");
	} 
	
	/*
	 * 
	 */
	public void accessModifierInvoke(){
		System.out.println("Welcome of accessModifierInvoke method of "
				+ "PublicClassFromOutsideItsPackage class");
	} 

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	}
}
