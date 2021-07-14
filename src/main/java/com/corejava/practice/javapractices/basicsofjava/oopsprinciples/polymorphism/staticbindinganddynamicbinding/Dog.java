package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.staticbindinganddynamicbinding;

/**
 * @author abhishek-sriv
 * 
 * When type of the object is determined at run-time, it is known as 
 * dynamic binding.
 * 
 * Example of dynamic-binding.
 */
public class Dog extends Animal {
	void eat(){
		System.out.println("dog is eating...");
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){  
		Animal animal = new Dog();  
		animal.eat();  
	}  
}
