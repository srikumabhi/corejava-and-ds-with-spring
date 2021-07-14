package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.objectsandclasses;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ObjectAndClassExampleMainOutsideTheClass {

	int id;  
	String nameOfTheDeveloper;  
}  

/**
 * Creating another class TestObjectAndClassExampleMainOutsideTheClass which contains the
 * main method. 
 */
class TestObjectAndClassExampleMainOutsideTheClass {

	public static void main(String args[]) {  

		ObjectAndClassExampleMainOutsideTheClass objectAndClassExampleMainOutsideTheClass
		= new ObjectAndClassExampleMainOutsideTheClass(); 

		System.out.println(objectAndClassExampleMainOutsideTheClass.id);  
		System.out.println(objectAndClassExampleMainOutsideTheClass.nameOfTheDeveloper);  
	} 

}
