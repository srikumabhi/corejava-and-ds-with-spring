package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression.JavaLambdaExpressionTypeInference;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestForJavaLambdaExpressionTypeInference {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(JavaLambdaExpressionTypeInference.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		JavaLambdaExpressionTypeInference javaLambdaExpressionTypeInference = 
				(JavaLambdaExpressionTypeInference)applicationContext.getBean("javalambdaexpressiontypeinference");

		javaLambdaExpressionTypeInference.useOfStringLengthLambda();

	}

}
