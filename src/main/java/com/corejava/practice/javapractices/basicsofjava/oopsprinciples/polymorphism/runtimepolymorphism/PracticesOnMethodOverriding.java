package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.runtimepolymorphism;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class PracticesOnMethodOverriding extends PracticesClass {

	void m1(){
		System.out.println("In m1 B");
	}

	void m2(){
		System.out.println("In m2 B");
	}

	public static void main(String[] args) {
		PracticesClass practicesClass = new PracticesOnMethodOverriding();
		/* 
		 * Compile time error
         * There will be compile-time error.
         * 
		 * practicesClass.m2(); 
		 */
		practicesClass.m1();
	}
}
