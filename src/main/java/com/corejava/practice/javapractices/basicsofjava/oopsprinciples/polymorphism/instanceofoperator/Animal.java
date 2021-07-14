package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.instanceofoperator;

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

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Animal animal1 = new Animal();
		System.out.println(animal1 instanceof Animal);
	}
}
