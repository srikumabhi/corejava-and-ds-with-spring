package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.compiletimepolymorphism;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class PracticesOnMethodOverloading {

	/**
	 * 
	 * @param string
	 */
	public void practicesForPrint(String string) {
		System.out.println("String args practicesForprint meth.");
	}

	/**
	 * 
	 * @param object
	 */
	public void practicesForPrint(Object object) {
		System.out.println("Object args practicesForprint meth.");
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PracticesOnMethodOverloading practicesOnMethodOverloading = new 
				PracticesOnMethodOverloading();

		/*
		 * Default value of String is null
		 */
		practicesOnMethodOverloading.practicesForPrint(null);
	}
}
