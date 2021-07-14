package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.compiletimepolymorphism.MethodOverloadingChangingDataTypeOfArguments;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestMethodOverloadingChangingDataTypeOfArguments {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
		new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(
				MethodOverloadingChangingDataTypeOfArguments.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		MethodOverloadingChangingDataTypeOfArguments methodOverloadingChangingDataTypeOfArguments = 
				(MethodOverloadingChangingDataTypeOfArguments)applicationContext.getBean(
						"methodoverloadingchangingdatatypeofarguments");

		/**
		 * 
		 */
		methodOverloadingChangingDataTypeOfArguments.
		methodOverloadingChangingDataTypeOfArgumentsImpl();

	}
	
}
