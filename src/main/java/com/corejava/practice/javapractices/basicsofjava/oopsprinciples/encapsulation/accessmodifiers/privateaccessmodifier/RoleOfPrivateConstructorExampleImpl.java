package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation.accessmodifiers.privateaccessmodifier;

/**
 * @author abhishek-sriv
 * 
 * If you make any class constructor private, you cannot create the 
 * instance of that class from outside the class.
 * 
 * Note:- A class cannot be private or protected except nested class.
 */
public class RoleOfPrivateConstructorExampleImpl {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * The constructor RoleOfPrivateConstructorExample() is not visible
		 * Compile Time Error  
		 */
		//RoleOfPrivateConstructorExample roleOfPrivateConstructor = 
		//		new RoleOfPrivateConstructorExample();
	}
}
