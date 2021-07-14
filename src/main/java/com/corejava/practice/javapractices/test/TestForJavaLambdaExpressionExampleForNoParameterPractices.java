package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression.JavaLambdaExpressionExampleForNoParameterPractices;

public class TestForJavaLambdaExpressionExampleForNoParameterPractices {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(JavaLambdaExpressionExampleForNoParameterPractices.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		JavaLambdaExpressionExampleForNoParameterPractices javaLambdaExpressionExampleForNoParameterPractices = 
				(JavaLambdaExpressionExampleForNoParameterPractices)applicationContext.getBean("javalambdaexpressionexamplefornoparameterpractices");

		/**
		 * 
		 */
		javaLambdaExpressionExampleForNoParameterPractices.javaLambdaExpressionExample1ForNoParameter();

		/**
		 * 
		 */
		javaLambdaExpressionExampleForNoParameterPractices.javaLambdaExpressionExample2ForNoParameter();

		/**
		 * 
		 */
		javaLambdaExpressionExampleForNoParameterPractices.javaLambdaExpressionExample3ForNoParameter();
		
	}

}
