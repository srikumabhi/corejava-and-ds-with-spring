package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.finalkeyword;

/**
 * @author abhishek-sriv
 * 
 * There is a final variable speedlimit, we are going to change the value of this 
 * variable, but It can't be changed because final variable once assigned a value 
 * can never be changed.
 */
public class ExampleOfFinalVariable {

	//final variable
	public final int developerId=101; 
	void modifiedDeveloperInfo(){  
		//developerId=201;  
		/*
		 * The final field ExampleOfFinalVariable.developerId 
		 * cannot be assigned. Compile Time Error.
		 */
	} 

	public final String developerName;
	ExampleOfFinalVariable(){
		developerName="Rinshu";
	}
}
