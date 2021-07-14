package com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression;

import org.springframework.stereotype.Component;

/**
 * 
 * @author abhishek-sriv
 *
 */
@Component("javalambdaexpressionvsinterfaceimplementations")
public class JavaLambdaExpressionVsInterfaceImplementations {

	/**
	 * 
	 */
	public void javaLambdaExpressionVsInterfaceImplementationsImpl() {

		/** 
		 * Greeter interface implements(perform meth) by GreeterImpl. 
		 */
		Greeter greeterImpl1 = new GreeterImpl();
		greeterImpl1.perform("Greeter interface implements by GreeterImpl.");

		/** 
		 * Greeter interface implements(perform meth) by Anonymous-Class. 
		 */
		Greeter greeterImpl2 = new GreeterImpl() {
			public void perform(String text) {
				System.out.println("JavaLambda Expression Vs "
						+ "Interface Implementations Example "+text);
			}
		};
		greeterImpl2.perform("Greeter interface implements by Anonymous-Class.");

		/** 
		 * Greeter interface implements(perform meth) by JavaLambda-Expression. 
		 */
		Greeter greeterImpl3 = (String text) -> System.out.println("JavaLambda Expression Vs "
				+ "Interface Implementations Example "+text);
		greeterImpl3.perform("Greeter interface implements by JavaLambda-Expression.");

	}

}
