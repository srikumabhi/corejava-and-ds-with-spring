package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation.accessmodifiers.privateaccessmodifier;

/**
 * @author abhishek-sriv
 * 
 * The private access modifier is accessible only within the 
 * class
 * 
 * we have created two classes ExampleOfPrivateAccessModifier and ExampleOfPrivateAccessModifierImpl. 
 * ExampleOfPrivateAccessModifier class contains private data member and private method. 
 * We are accessing these private members from outside the class, 
 * so there is a compile-time error.
 * 
 * Note:- A class cannot be private or protected except nested class.
 */
class ExampleOfPrivateAccessModifier {

	private int developerId=101;

	private void developerInfo(){
		System.out.println("Java-Developer");
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ExampleOfPrivateAccessModifier exampleOfPrivateAccessModifier = 
				new ExampleOfPrivateAccessModifier();

		System.out.println(exampleOfPrivateAccessModifier.developerId); 
		exampleOfPrivateAccessModifier.developerInfo(); 
	}
}
