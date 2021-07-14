package com.corejava.practice.javapractices.basicsofjava.variables;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ExampleOfVariableDeclarations {

	//1 - Instance variable(Variable of int type)
	int intType = 10; 

	//2 - Class variable
	static float PI = 3.14f;    

	public void localVariable() {
		//3 - Local variable (inside method body)
		int age = 30;    
		System.out.println("Local variable=> "+age);
	}

	//4 - Method Argument
	public void methodArgument(int param) {      
		System.out.println ("Method Argument=> "+param);
	}

	//Variable of object type
	Object object = new Object();

	//Variable of string type
	String stringType = "Abhishek Kumar Srivastava"; 

	//Variable of int type
	int[] scores = {1,2,3,4,5,6,7,8,9}; 

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ExampleOfVariableDeclarations exampleOfVariableDeclarations = new 
				ExampleOfVariableDeclarations();
		/*
		 * To access instance variable, you must create a new instance of class.
		 */
		System.out.println("Instance-Variable=> "+exampleOfVariableDeclarations.intType);
		System.out.println("Instance-Variable=> "+exampleOfVariableDeclarations.object);
		System.out.println("Instance-Variable=> "+exampleOfVariableDeclarations.stringType);
		System.out.println("Instance-Variable=> "+exampleOfVariableDeclarations.scores);

		/*
		 * Class variables are accessible through class reference, and do not 
		 * require to create object instance.
		 */
		System.out.println("Static-Variable=> "+ExampleOfVariableDeclarations.PI);
	}

}
