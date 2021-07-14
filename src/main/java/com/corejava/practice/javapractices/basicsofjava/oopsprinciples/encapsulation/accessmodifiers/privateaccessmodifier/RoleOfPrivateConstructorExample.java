package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation.accessmodifiers.privateaccessmodifier;

/**
 * @author abhishek-sriv
 * 
 * Note:- A class cannot be private or protected except nested class.
 */
public class RoleOfPrivateConstructorExample {

	//private constructor  
	private RoleOfPrivateConstructorExample(){
	}

	/* */
	private void developerMsg(){
		System.out.println("Hello Java-DevelopersBeenWithDefaultEqualsAndHashCodeMethod");
	}

	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		RoleOfPrivateConstructorExample roleOfPrivateConstructorExample = 
				new RoleOfPrivateConstructorExample();
	}
}
