package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.compiletimepolymorphism;

import org.springframework.stereotype.Component;

/**
 * 
 * @author abhishek-sriv
 * 
 * Method overloading increases the readability of the program.
 */
@Component("methodoverloadingchangingnumberofarguments")
public class MethodOverloadingChangingNumberOfArguments {

	int add(int a,int b) {
		return a+b;
	}  

	int add(int a,int b,int c) {
		return a+b+c;
	} 

	/**
	 * @return 
	 * 
	 */
	public void methodOverloadingChangingNumberOfArgumentsImpl() {
		System.out.println("Two Args Meth=> "+ add(100, 200));
		System.out.println("Three Args Meth=> "+ add(100, 200, 300));
	}

}
