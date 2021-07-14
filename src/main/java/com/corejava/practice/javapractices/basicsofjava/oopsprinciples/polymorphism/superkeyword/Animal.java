package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.
polymorphism.superkeyword;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Animal {

	Animal(){
		System.out.println("Animal class(Super-Class) construtor. "
				+ "Animal is created...");
	} 

	public static String mainActivity = "Breathing !!";
	public String colour="Color will be according to Animal..."; 

	public void eat(){
		System.out.println("eating...");
	}

	/**
	 * 
	 */
	public static void showAnimal() {
		System.out.println("public static method(showAnimal) of Animal class");
	}
}
