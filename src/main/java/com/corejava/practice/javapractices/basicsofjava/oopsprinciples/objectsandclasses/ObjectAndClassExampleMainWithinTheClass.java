package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.objectsandclasses;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ObjectAndClassExampleMainWithinTheClass {

	//defining fields  
	int id;//field or data member or instance variable  
	String nameOfTheDeveloper;  

	//creating main method inside the ObjectAndClassExampleMainWithinTheClass class  
	public static void main(String args[]) {  

		//Creating an object or instance  
		ObjectAndClassExampleMainWithinTheClass objectAndClassExampleMainWithinTheClass
		= new ObjectAndClassExampleMainWithinTheClass(); //creating an object of ObjectAndClassExampleMainWithinTheClass

		//Printing values of the object  
		System.out.println(objectAndClassExampleMainWithinTheClass.id); //accessing member through reference variable  
		System.out.println(objectAndClassExampleMainWithinTheClass.nameOfTheDeveloper);  
	}

}
