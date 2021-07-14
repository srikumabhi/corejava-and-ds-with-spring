package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.compiletimepolymorphism;

/**
 * 
 * @author abhishek-sriv
 * 
 * In java, method overloading is not possible by changing the return type of the 
 * method only because of ambiguity.Let's see how ambiguity may occur:
 */
public class ChangingTheReturnTypeOfMethodOnly {

	int add(int a,int b) {
		return a+b;
	}

	/**
	 * Compile Time Error: method add(int,int) is already defined in class ChangingTheReturnTypeOfMethodOnly. 
	 */
	/* Commented.
	 * double add(int a,int b){ return a+b; }
	 */ 

	public void changingTheReturnTypeOfMethodOnlyImpl(){
		System.out.println(add(100,200));//ambiguity  
	}

}
