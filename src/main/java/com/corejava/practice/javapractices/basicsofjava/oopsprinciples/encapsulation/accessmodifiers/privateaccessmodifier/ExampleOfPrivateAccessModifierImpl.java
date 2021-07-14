package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation.accessmodifiers.privateaccessmodifier;

/**
 * @author abhishek-sriv
 * 
 * we have created two classes ExampleOfPrivateAccessModifier and ExampleOfPrivateAccessModifierImpl. 
 * ExampleOfPrivateAccessModifier class contains private data member and private method. 
 * We are accessing these private members from outside the class, 
 * so there is a compile-time error.
 * 
 * Note:- A class cannot be private or protected except nested class.
 */
public class ExampleOfPrivateAccessModifierImpl {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ExampleOfPrivateAccessModifier exampleOfPrivateAccessModifier = 
				new ExampleOfPrivateAccessModifier();
		/**
		 * The private access modifier is accessible only within 
		 * the class.
		 */
		/*
		 * The field ExampleOfPrivateAccessModifier.developerId is not 
		 * visible
		 */
		//System.out.println(privateAccessModifier.developerId); //Compile Time Error 

		/*
		 * The method developerInfo() from the type 
		 * ExampleOfPrivateAccessModifier is not visible
		 */
		//privateAccessModifier.developerInfo(); //Compile Time Error 
	}
}
