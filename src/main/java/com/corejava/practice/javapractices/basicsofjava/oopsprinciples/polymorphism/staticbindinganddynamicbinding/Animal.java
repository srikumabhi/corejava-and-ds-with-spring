package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.staticbindinganddynamicbinding;

/**
 * @author abhishek-sriv
 * 
 * When type of the object is determined at compiled time(by the compiler), 
 * it is known as static binding. If there is any private, final or static
 * method in a class, there is static binding.
 * 
 * Example of static-binding.
 */
public class Animal {
	void eat(){
		System.out.println("eating...");
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
	}
}
