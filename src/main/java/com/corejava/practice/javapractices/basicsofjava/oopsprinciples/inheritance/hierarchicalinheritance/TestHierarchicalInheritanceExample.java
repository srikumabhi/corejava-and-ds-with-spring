package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.inheritance.hierarchicalinheritance;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestHierarchicalInheritanceExample {

	public static void main(String args[]){ 

		Cat cat = new Cat(); 
		cat.eat(); 
		cat.meow();  
		// cat.bark();  //compile time error.  
		
		System.out.println("##############################");
		
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		// dog.meow(); //compile time error.  

	}
}
