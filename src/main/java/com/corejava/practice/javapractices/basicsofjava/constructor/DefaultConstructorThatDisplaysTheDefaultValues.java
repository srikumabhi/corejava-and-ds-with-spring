package com.corejava.practice.javapractices.basicsofjava.constructor;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class DefaultConstructorThatDisplaysTheDefaultValues {

	int developerId;  
	String developerName; 

	//method to display the value of id and name  
	void display(){
		System.out.println(developerId+" "+developerName);
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {  

		//creating objects  
		DefaultConstructorThatDisplaysTheDefaultValues defaultConstructorThatDisplaysTheDefaultValues1 
		= new DefaultConstructorThatDisplaysTheDefaultValues();  
		DefaultConstructorThatDisplaysTheDefaultValues defaultConstructorThatDisplaysTheDefaultValues2 
		= new DefaultConstructorThatDisplaysTheDefaultValues(); 

		//displaying default-values of the object  
		defaultConstructorThatDisplaysTheDefaultValues1.display();  
		defaultConstructorThatDisplaysTheDefaultValues2.display();  

	}  

}
