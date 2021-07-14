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
public class ObjectAndClassExampleInitializationThroughMethod {

	int developerId;  
	String nameOfTheDeveloper; 

	/**
	 * 
	 * @param r
	 * @param n
	 */
	void insertRecord(int id, String name){  
		developerId=id;  
		nameOfTheDeveloper=name;  
	} 

	/**
	 * 
	 */
	void displayInformation(){
		System.out.println(developerId+" "+nameOfTheDeveloper);
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){

		ObjectAndClassExampleInitializationThroughMethod objectAndClassExampleInitializationThroughMethod1
		= new ObjectAndClassExampleInitializationThroughMethod();  

		ObjectAndClassExampleInitializationThroughMethod objectAndClassExampleInitializationThroughMethod2 
		= new ObjectAndClassExampleInitializationThroughMethod(); 

		// Using the method.
		objectAndClassExampleInitializationThroughMethod1.insertRecord(101,
				"Abhishek Kumar Srivastava");  
		objectAndClassExampleInitializationThroughMethod2.insertRecord(102,"Rinshu"); 

		objectAndClassExampleInitializationThroughMethod1.displayInformation();  
		objectAndClassExampleInitializationThroughMethod2.displayInformation();  
	}  

}
