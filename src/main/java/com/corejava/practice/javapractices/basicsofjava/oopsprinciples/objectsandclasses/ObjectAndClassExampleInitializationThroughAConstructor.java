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
public class ObjectAndClassExampleInitializationThroughAConstructor {

	int developerId;  
	String nameOfTheDeveloper;  
	float developerSalary;  

	/**
	 * 
	 * @param developerId
	 * @param nameOfTheDeveloper
	 * @param developerSalary
	 */
	ObjectAndClassExampleInitializationThroughAConstructor(
			int developerId, String nameOfTheDeveloper, float developerSalary) {

		this.developerId = developerId;  
		this.nameOfTheDeveloper= nameOfTheDeveloper;  
		this.developerSalary=developerSalary;  
	} 

	/**
	 * 
	 */
	void display(){
		System.out.println(developerId+" "+nameOfTheDeveloper+" "+developerSalary);
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {  

		ObjectAndClassExampleInitializationThroughAConstructor objectAndClassExampleInitializationThroughAConstructor 
		= new ObjectAndClassExampleInitializationThroughAConstructor(
				101, "Abhishek Kumar Srivastava", 1200000);    

		objectAndClassExampleInitializationThroughAConstructor.display(); 

	}

}
