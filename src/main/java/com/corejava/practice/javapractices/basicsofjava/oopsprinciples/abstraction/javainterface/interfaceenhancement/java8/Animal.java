package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface.interfaceenhancement.java8;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Animal extends Dog implements Moveable, Walkable {

	@Override
	public void move() {
		Moveable.super.move();
	}

	void show() {
		System.out.println("show(default) method in Animal class.");
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Animal.dogMovmentCount(0);
	}
}
