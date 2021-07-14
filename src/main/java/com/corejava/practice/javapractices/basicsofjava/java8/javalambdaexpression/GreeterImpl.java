package com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class GreeterImpl implements Greeter{

	@Override
	public void perform(String text) {
		System.out.println("JavaLambda Expression Vs "
				+ "Interface Implementations Example "+text);
	}

}
