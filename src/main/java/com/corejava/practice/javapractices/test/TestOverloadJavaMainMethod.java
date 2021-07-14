package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.compiletimepolymorphism.OverloadJavaMainMethod;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestOverloadJavaMainMethod {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
		new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(OverloadJavaMainMethod.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		OverloadJavaMainMethod overloadJavaMainMethod = 
				(OverloadJavaMainMethod)applicationContext.getBean("overloadjavamainmethod");

		/**
		 * 
		 */
		overloadJavaMainMethod.overloadJavaMainMethodImpl();

	}

}
