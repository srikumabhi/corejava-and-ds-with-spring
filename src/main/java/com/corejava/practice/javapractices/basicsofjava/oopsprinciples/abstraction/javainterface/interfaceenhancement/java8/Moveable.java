package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface.interfaceenhancement.java8;

/**
 * 
 * @author abhishek-sriv
 *
 */
public interface Moveable {
	
	default void move() {
		System.out.println("move(default) method in Moveable interface.");
	}

	public static int movmentCount(int x){
		System.out.println("movmentCount(static) method in Moveable interface.");
		return x*x*x;
	}  
}
