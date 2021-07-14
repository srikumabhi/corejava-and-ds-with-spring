package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ExampleOfEncapsulationInJava {

	/*
	 * Encapsulation in Java is a process of wrapping code and data 
	   together into a single unit, for example, a capsule which is 
	   mixed of several medicines.
	 * We can create a fully encapsulated class in Java by making all 
	   the data members of the class private. Now we can use setter and 
	   getter methods to set and get the data in it.
	 * The Java Bean class is the example of a fully encapsulated class.
	 */

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Developer developer = new Developer();

		developer.setDeveloperName("Abhishek Kumar Srivastava");
		System.out.println("Developer-Name:- "+developer.getDeveloperName());
	}
}
