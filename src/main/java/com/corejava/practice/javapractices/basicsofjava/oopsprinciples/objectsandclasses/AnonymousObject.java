package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.objectsandclasses;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class AnonymousObject {

	/*
	 * Anonymous simply means nameless. An object which has no reference is known as an 
	 * anonymous object. It can be used at the time of object creation only.
	 */
	
	/**
	 * 
	 * @param n
	 */
	void getFactorial(int n) {
		
		int fact=1;  
		for(int i=1;i<=n;i++) {  
			fact=fact*i;  
		}

		System.out.println("factorial is "+fact);  
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) { 
		//calling method with anonymous object  
		new AnonymousObject().getFactorial(5);
	}  

}
