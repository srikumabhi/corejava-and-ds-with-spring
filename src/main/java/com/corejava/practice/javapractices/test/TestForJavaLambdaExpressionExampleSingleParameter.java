package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression.JavaLambdaExpressionExampleSingleParameter;

public class TestForJavaLambdaExpressionExampleSingleParameter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(JavaLambdaExpressionExampleSingleParameter.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		JavaLambdaExpressionExampleSingleParameter javaLambdaExpressionExampleSingleParameter = 
				(JavaLambdaExpressionExampleSingleParameter)applicationContext.getBean(
						"javalambdaexpressionexamplesingleparameter");

		/**
		 * 
		 */
		javaLambdaExpressionExampleSingleParameter.javaLambdaExpressionExample1SingleParameter();;

	}

}
