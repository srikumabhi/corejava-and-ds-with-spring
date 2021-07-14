package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.inheritance.singleinheritance;

/**
 * @author abhishek-sriv
 * 
 * When a class inherits another class, it is known as a single inheritance. 
 * In the example given below, Dog class inherits the Animal class, so there is the 
 * single inheritance.
 */
public class Dog extends Animal {
	
	void bark() {
		System.out.println("barking...");
	}  
}
