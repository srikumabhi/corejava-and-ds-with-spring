package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.compiletimepolymorphism.MethodOverloadingChangingNumberOfArguments;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestMethodOverloadingChangingNumberOfArguments {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
		new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(
				MethodOverloadingChangingNumberOfArguments.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		MethodOverloadingChangingNumberOfArguments methodOverloadingChangingNumberOfArguments = 
				(MethodOverloadingChangingNumberOfArguments)applicationContext.getBean(
						"methodoverloadingchangingnumberofarguments");

		/**
		 * 
		 */
		methodOverloadingChangingNumberOfArguments.
		methodOverloadingChangingNumberOfArgumentsImpl();

	}
}
