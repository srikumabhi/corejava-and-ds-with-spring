package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.abstractclass;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestShapeAndImpl {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Shape shape1 = new Rectangle();
		shape1.draw();

		Shape shape2 = new Circle();
		shape2.draw();
	}
}
