package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.compiletimepolymorphism;

import org.springframework.stereotype.Component;

/**
 * @author abhishek-sriv
 * 
 * Compile Time Polymorphism (static binding or method overloading).
 */
@Component("overloadjavamainmethod")
public class OverloadJavaMainMethod {

	public static void main() {
		System.out.println("main meth without args");
	}

	public static void main(String args) {
		System.out.println("main meth with String=> "+args);
	}

	public static void main(String[] args) {
		System.out.println("main meth with String[] => "+args);
	} 

	/**
	 * 
	 */
	public void overloadJavaMainMethodImpl() {

		OverloadJavaMainMethod.main();
		OverloadJavaMainMethod.main("Abhishek");

		//declaration and instantiation 
		String mainMethWithString[] = new String[3]; 
		//initialization  
		mainMethWithString[0]="Abhishek";
		mainMethWithString[1]="Kumar";  
		mainMethWithString[2]="Srivastava";
		// Calling the meth by passing the arg
		OverloadJavaMainMethod.main(mainMethWithString.toString());
	}

}
