package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.objectsandclasses;

/**
 * @author abhishek-sriv
 * 
 * Ways to initialize object
 *   There are 3 ways to initialize object in Java.
 *     By reference variable
 *     By method
 *     By constructor
 */
public class ObjectAndClassExampleInitializationThroughReference {

	int id;  
	String nameOfTheDeveloper;  

	public static void main(String args[]){ 

		ObjectAndClassExampleInitializationThroughReference objectAndClassExampleInitializationThroughReference
		= new ObjectAndClassExampleInitializationThroughReference(); 

		// Using the references.
		objectAndClassExampleInitializationThroughReference.id = 101;  
		objectAndClassExampleInitializationThroughReference.nameOfTheDeveloper = 
				"Abhishek Kumar Srivastava"; 

		System.out.println(objectAndClassExampleInitializationThroughReference.id+" "
				+""+objectAndClassExampleInitializationThroughReference.nameOfTheDeveloper);//printing members with a white space  
	}  

}
