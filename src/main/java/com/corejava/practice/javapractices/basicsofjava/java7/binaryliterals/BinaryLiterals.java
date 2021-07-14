package com.corejava.practice.javapractices.basicsofjava.java7.binaryliterals;

import org.springframework.stereotype.Component;

/**
 * @author abhishek-sriv
 * 
 * Java added a new feature Binary Literal in Java 7, allows you to express 
 * integral types (byte, short, int, and long) in binary number system.
 */
@Component("binaryliterals")
public class BinaryLiterals {

	/**
	 * In the following example, we are creating binary literals from integral 
	 * values.
	 */
	public void BinaryLiteralsExample1() {

		// Binary literal in byte type  
		byte b1 = 0b101;    // Using b0, The b can be lower or upper case  
		byte b2 = 0B101;    // Using B0  
		System.out.println("----------Binary Literal in Byte----------------");  
		System.out.println("b1 = "+b1);  
		System.out.println("b2 = "+b2);  

		// Binary literal in short type  
		short s1 = 0b101;   // Using b0, The b can be lower or upper case  
		short s2 = 0B101;   // Using B0  
		System.out.println("----------Binary Literal in Short----------------");  
		System.out.println("s1 = "+s1);  
		System.out.println("s2 = "+s2);  

		// Binary literal in int type  
		int i1 = 0b101;     // Using b0, The b can be lower or upper case  
		int i2 = 0B101;     // Using B0  
		System.out.println("----------Binary Literal in Integer----------------");  
		System.out.println("i1 = "+i1);  
		System.out.println("i2 = "+i2);  

		// Binary literal in long type  
		long l1 = 0b0000011111100001;   // Using b0, The b can be lower or upper case  
		long l2 = 0B0000011111100001;   // Using B0  
		System.out.println("----------Binary Literal in Long----------------");  
		System.out.println("l1 = "+l1);  
		System.out.println("l2 = "+l2);  

	}

	/**
	 * In this example, we are creating negative binary, using underscore in binary literals and manipulating as well.
	 */
	public void BinaryLiteralsExample2() {

		byte b1 = 5; // a decimal value  
		// Using binary of 5  
		byte b2 = 0b101;    // using b0, The b can be lower or upper case  
		// Declaring negative binary  
		byte b3 = -0b101;  
		// Using underscore in binary literal  
		byte b4 = 0b101_0;  
		System.out.println("b1 = "+b1);  
		System.out.println("b2 = "+b2);  
		System.out.println("b3 = "+b3);  
		System.out.println("b4 = "+b4);  
		// Check whether binary and decimal are equal   
		System.out.println("is b1 and b2 equal: "+(b1==b2));  
		// Perform operation on binary value  
		System.out.println("b2 + 1 = "+(b2+1));  
		// Perform operation on negative binary value  
		System.out.println("b3 + 1 = "+(b3+1));  
		System.out.println("b4 x 2 = "+(b4*2));
	}

}
