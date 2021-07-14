package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface;

/**
 * @author abhishek-sriv
 * 
 * Interface Example.
 */
public interface Printable {
	void print(); 

	/*
	 * Nested Interface in Java..
	 * An interface can have another interface which is known as a nested interface.
	 */
	interface MessagePrintable{  
		void msg();  
	}  
}
