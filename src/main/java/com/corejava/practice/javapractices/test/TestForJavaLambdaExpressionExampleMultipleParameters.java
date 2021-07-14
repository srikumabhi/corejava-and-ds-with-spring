package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression.JavaLambdaExpressionExampleMultipleParameters;

public class TestForJavaLambdaExpressionExampleMultipleParameters {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(JavaLambdaExpressionExampleMultipleParameters.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		JavaLambdaExpressionExampleMultipleParameters javaLambdaExpressionExampleMultipleParameters = 
				(JavaLambdaExpressionExampleMultipleParameters)applicationContext.getBean(
						"javalambdaexpressionexamplemultipleparameters");

		/**
		 * 
		 */
		javaLambdaExpressionExampleMultipleParameters.javaLambdaExpressionExample1MultipleParameters();

	}
}
