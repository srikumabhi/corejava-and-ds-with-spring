package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.association.aggregation;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Circle {

	//aggregation 
	Operation operation;  
	double pi=3.14;  

	public double area(int radius) {

		operation = new Operation();

		//code reusability (i.e. delegates the method call).  
		int rsquare = operation.square(radius); 
		return pi*rsquare;  
	}

}
