package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface;

/**
 * @author abhishek-sriv
 * 
 * In this example, the Printable interface has only one method, and its 
 * implementation is provided in the UseOfPrintableInterface class.
 */
public class UseOfPrintableInterface implements Printable {

	@Override
	public void print() {
		System.out.println("Java Interface Example");
	}

	public static void main(String[] args) {
		Printable printable = new UseOfPrintableInterface();
		printable.print();
	}
}
