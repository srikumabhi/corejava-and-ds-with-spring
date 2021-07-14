package com.corejava.practice.javapractices.basicsofjava.constructor;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class DefaultConstructor {

	//creating a default constructor  
	DefaultConstructor(){
		System.out.println("Default-Constructor is created");
	}  

	public void display() {
		System.out.println("Example of Default-Constructor");
	}

	//main method  
	public static void main(String args[]){

		//calling a default constructor  
		DefaultConstructor defaultConstructor = new DefaultConstructor(); 
		defaultConstructor.display();
	}  

}
