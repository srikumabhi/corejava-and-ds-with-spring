package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.finalkeyword;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ExampleOfStaticBlankFinalVariableImpl extends 
ExampleOfStaticBlankFinalVariable {

	/*	 */
	public void show() {
		System.out.println(ExampleOfStaticBlankFinalVariableImpl.
				DEVELOPER_NAME);
		System.out.println(ExampleOfStaticBlankFinalVariableImpl.
				PAN_CARD_NUMBER);
		System.out.println(ExampleOfStaticBlankFinalVariableImpl.
				developerCompanyName);
		System.out.println(ExampleOfStaticBlankFinalVariableImpl.
				TEST);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new ExampleOfStaticBlankFinalVariableImpl().show();
	}
}
