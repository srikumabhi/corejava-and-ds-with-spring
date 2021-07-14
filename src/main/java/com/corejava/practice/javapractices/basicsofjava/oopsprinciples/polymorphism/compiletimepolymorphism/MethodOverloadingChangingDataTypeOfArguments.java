package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.compiletimepolymorphism;

import org.springframework.stereotype.Component;

/**
 * 
 * @author abhishek-sriv
 *
 */
@Component("methodoverloadingchangingdatatypeofarguments")
public class MethodOverloadingChangingDataTypeOfArguments {

	int add(int a,int b) {
		return a+b;
	}  

	double add(double a,double b) {
		return a+b;
	}

	/**
	 * @return 
	 * 
	 */
	public void methodOverloadingChangingDataTypeOfArgumentsImpl() {
		System.out.println("Meth Return Type int=> "+ add(100,200));
		System.out.println("Meth Return Type double=> "+ add(10.01,200.2));
	}

}
