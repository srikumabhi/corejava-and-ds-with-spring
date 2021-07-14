package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.runtimepolymorphism.java5.covariantreturntype;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ChildClassExample1OfCovariantReturnType extends 
SuperClassExampleOfCovariantReturnType {

	/** */
	public ChildClassExample1OfCovariantReturnType get(){
		return this;
	}
	/** */
	public void message(){
		System.out.println("welcome to covariant return type");
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		new ChildClassExample1OfCovariantReturnType().get().message();
	}
}
