package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface.interfaceenhancement.java8;

/**
 * 
 * @author abhishek-sriv
 *
 */
public interface Walkable {
	
	default void move() {
		System.out.println("move(default) method in Walkable interface.");
	}

	public static int movmentCount(int x) {
		return x*x*x;
	}  
}
