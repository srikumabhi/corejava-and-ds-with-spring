package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression.RunnableUsingLambdas;

/**
 * 
 * @author Administrator
 *
 */
public class TestForRunnableUsingLambdas {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(RunnableUsingLambdas.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		RunnableUsingLambdas runnableUsingLambdas = 
				(RunnableUsingLambdas)applicationContext.getBean("runnableusinglambdas");

		/**
		 * 
		 */
		runnableUsingLambdas.runnableUsingLambdasImpl();

	}

}
