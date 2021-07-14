package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation.accessmodifiers;

/**
 * 
 * @author abhishek-sriv
 *
 */
class DefaultClassFromOutsideItsPackage {

	/*
	 * 
	 */
	private void accessModifierMsg(){
		System.out.println("Welcome of accessModifierMsg method of "
				+ "DefaultClassFromOutsideItsPackage class");
	} 

	/*
	 * 
	 */
	void accessModifierPrint(){
		System.out.println("Welcome of accessModifierPrint method of "
				+ "DefaultClassFromOutsideItsPackage class");
	} 

	/*
	 * 
	 */
	protected void accessModifierShow(){
		System.out.println("Welcome of accessModifierShow method of "
				+ "DefaultClassFromOutsideItsPackage class");
	} 
	
	/*
	 * 
	 */
	public void accessModifierInvoke(){
		System.out.println("Welcome of accessModifierInvoke method of "
				+ "DefaultClassFromOutsideItsPackage class");
	} 

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}
}
