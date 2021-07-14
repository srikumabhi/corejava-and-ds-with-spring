package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface;

/**
 * @author abhishek-sriv
 *
 */
public class MultipleInheritanceInJavaByInterface implements 
Printable, Drawable, Showable {

	@Override
	public void show() {
		System.out.println("show method of Showable interface...");
	}

	@Override
	public void draw() {
		System.out.println("draw method of Drawable interface...");
	}

	@Override
	public void print() {
		System.out.println("print method of Printable interface...");
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		MultipleInheritanceInJavaByInterface multipleInheritanceInJavaByInterface = 
				new MultipleInheritanceInJavaByInterface();

		multipleInheritanceInJavaByInterface.print();
		multipleInheritanceInJavaByInterface.draw();
		multipleInheritanceInJavaByInterface.show();
	}
}
